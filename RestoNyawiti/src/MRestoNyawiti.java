/*  Anggota Kelompok:
*   Akbar Mukti Wibowo				24060124130063
*   Farras Hilmy Zaidan 			24060124120003
*   Agil Yudis Wibawa 				24060124120045
*   Aufaarel Nabiil Aryadh Mecca 	24060124140206
*   Fakhri Ali Azadi				24060123140128
*/

import java.time.LocalDate;

public class MRestoNyawiti {
    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println("          DATA KARYAWAN RESTO NYAWITI             ");
        System.out.println("==================================================\n");
        
        //Koki Kontrak
        KokiKontrak kokiKontrak = new KokiKontrak(
            "Juna Edi", 
            LocalDate.of(2006, 5, 5), 
            LocalDate.of(2019, 4, 5), 
            5000000, 
            "Masakan Nusantara", 
            LocalDate.of(2026, 8, 1)
        );
        kokiKontrak.printInfo();
        System.out.println();

        // Kasir
        Kasir kasir = new Kasir(
            "Joko Oslo", 
            LocalDate.of(1998, 8, 17), 
            LocalDate.of(2022, 1, 10), 
            4000000, 
            "CERT-FIN-01"
        );
        kasir.printInfo();
        System.out.println();

        // Koki Tetap
        KokiTetap kokiTetap = new KokiTetap(
            "Prabu Rowo", 
            LocalDate.of(1985, 10, 10), 
            LocalDate.of(2010, 2, 1), 
            7000000, 
            "Chinese Food", 
            "KUL-NAS-099"
        );
        kokiTetap.printInfo();
        System.out.println();

        // Pelayan
        Pelayan pelayan = new Pelayan(
            "Mega Lodon", 
            LocalDate.of(2002, 3, 12), 
            LocalDate.of(2023, 6, 1), 
            3000000
        );
        pelayan.printInfo();
        System.out.println();


        System.out.println("==================================================");
        System.out.println("             SIMULASI TRANSAKSI                   ");
        System.out.println("==================================================\n");

        ItemMenu m1 = new ItemMenu("M01", "Ayam Geprek", 20000, "Makanan");
        ItemMenu m2 = new ItemMenu("M02", "Kepiting Saus Tiram", 50000, "Makanan");
        ItemMenu m3 = new ItemMenu("M03", "Es Teh Jumbo", 5000, "Minuman");

        try {
            Pesanan pesanan = new Pesanan("P-001");
            pesanan.tambahItem(m1, 2); // 2 x 20.000 = 40.000
            pesanan.tambahItem(m2, 2); // 2 x 50.000 = 100.000
            pesanan.tambahItem(m3, 4); // 4 x 5.000 = 20.000
            // Subtotal = 160.000

            Transaksi trx = new Transaksi(pesanan, kasir);

            System.out.println("=========== NYAWITI RESTO ===========");
            System.out.println("ID TRX\t\t: " + trx.getIdTransaksi());
            System.out.println("Kasir\t\t: " + trx.getKasir().getNama());
            System.out.println("-------------------------------------");
            
            for (ItemPesanan item : pesanan.getDaftarItem()) {
                System.out.printf("%d x %-25s Rp %,.2f\n", 
                    item.getQty(), 
                    item.getMenu().getNama(), 
                    item.subTotal());
            }
            
            System.out.println("-------------------------------------");
            double subtotal = pesanan.hitungTotal();
            System.out.printf("SubTotal\t: Rp %,.2f\n", subtotal);
            
            double totalAkhir = subtotal + trx.hitungPajak(subtotal) - trx.hitungDiskon(subtotal);
            System.out.printf("Total Akhir\t: Rp %,.2f\n", totalAkhir);

            trx.prosesBayar(200000);

        } catch (MenuException e) {
            System.err.println("Kesalahan Menu: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Kesalahan Transaksi: " + e.getMessage());
        }
    }
}