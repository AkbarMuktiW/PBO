/*  Anggota Kelompok:
*   Akbar Mukti Wibowo				24060124130063
*   Farras Hilmy Zaidan 			24060124120003
*   Agil Yudis Wibawa 				24060124120045
*   Aufaarel Nabiil Aryadh Mecca 	24060124140206
*   Fakhri Ali Azadi				24060123140128
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaksi implements ICalculatable {
    private String idTransaksi;
    private Pesanan pesanan;
    private Kasir kasir;
    private Struk struk;
    private static int counterTrx = 0;

    public Transaksi(Pesanan p, Kasir k) {
        this.pesanan = p;
        this.kasir = k;
        
        counterTrx++;
        String tgl = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        this.idTransaksi = "TRX-" + tgl + "-" + String.format("%04d", counterTrx);
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public Pesanan getPesanan() {
        return pesanan;
    }

    public Kasir getKasir() {
        return kasir;
    }

    public Struk getStruk() {
        return struk;
    }

    @Override
    public double hitungPajak(double total) {
        return total * PPN; 
    }

    @Override
    public double hitungDiskon(double total) {
        if (total > 100000) {
            return total * 0.05;
        }
        return 0;
    }

    public void prosesBayar(double uang) throws Exception {
        double subtotal = pesanan.hitungTotal();
        double pajak = hitungPajak(subtotal);
        double diskon = hitungDiskon(subtotal);
        double totalAkhir = subtotal + pajak - diskon;
        double kembali = uang - totalAkhir;

        // Eksepsi jika pembayaran kurang
        if (uang < totalAkhir) {
            throw new Exception("Transaksi Gagal! Uang pelanggan kurang Rp" + (totalAkhir - uang));
        }

        this.struk = new Struk(uang, kembali, pajak, diskon);
        this.struk.cetak();
    }
}