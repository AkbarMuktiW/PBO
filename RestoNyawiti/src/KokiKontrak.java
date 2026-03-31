/*  Anggota Kelompok:
*   Akbar Mukti Wibowo				24060124130063
*   Farras Hilmy Zaidan 			24060124120003
*   Agil Yudis Wibawa 				24060124120045
*   Aufaarel Nabiil Aryadh Mecca 	24060124140206
*   Fakhri Ali Azadi				24060123140128
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class KokiKontrak extends Koki {
    /* ATRIBUT */
    private LocalDate tglAkhirKontrak;

    /* KONSTRUKTOR */
    // Konstruktor kosong
    public KokiKontrak() {
        super();
        this.tglAkhirKontrak = LocalDate.now();
    }

    // Konstruktor berparameter
    public KokiKontrak(String nama, LocalDate tglLahir, LocalDate tmt, double gaji, String spesialisasi, LocalDate tglAkhir) {
        super(nama, tglLahir, tmt, gaji, spesialisasi);
        this.tglAkhirKontrak = tglAkhir;
    }

    /* GETTER SETTER */
    // Getter
    public LocalDate getTglAkhirKontrak() {
        return tglAkhirKontrak;
    }

    // Setter
    public void setTglAkhirKontrak(LocalDate tgl) {
        this.tglAkhirKontrak = tgl;
    }

    /* METHOD */
    @Override
    public double hitungTunjangan() {
        return 0.15 * gajiPokok;
    }

    public String getMasaKontrak() {
        Period p = Period.between(LocalDate.now(), tglAkhirKontrak);
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    @Override
    public void printInfo() {
        //Format uang Indonesia
        Locale indo = new Locale("id", "ID");
        //Format tanggal Indonesia
        DateTimeFormatter formatTgl = DateTimeFormatter.ofPattern("d MMMM yyyy", indo);

        System.out.println("=== KOKI KONTRAK ===");
        System.out.println("NIK                 : " + nik);
        System.out.println("Nama                : " + nama);
        System.out.println("Tanggal Lahir       : " + tglLahir.format(formatTgl));
        System.out.println("TMT                 : " + tmt.format(formatTgl));
        System.out.printf(indo, "Gaji Pokok          : Rp %,.2f\n", gajiPokok);
        System.out.println("Masa Kerja          : " + hitungMasaKerja());
        System.out.println("Spesialisasi        : " + spesialisasi);
        System.out.println("Jabatan             : Koki Kontrak");
        System.out.println("Akhir Kontrak       : " + tglAkhirKontrak.format(formatTgl));
        System.out.println("Sisa Kontrak        : " + getMasaKontrak());
        System.out.printf(indo, "Tunjangan           : 15%% x Rp %,.2f = Rp %,.2f\n", this.gajiPokok, hitungTunjangan());
    }
}