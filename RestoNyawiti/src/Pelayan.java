/*  Anggota Kelompok:
*   Akbar Mukti Wibowo				24060124130063
*   Farras Hilmy Zaidan 			24060124120003
*   Agil Yudis Wibawa 				24060124120045
*   Aufaarel Nabiil Aryadh Mecca 	24060124140206
*   Fakhri Ali Azadi				24060123140128
*/

import java.util.Locale;

public class Pelayan extends StafOperasional {
    /* KONSTRUKTOR */
    // Konstruktor kosong
    public Pelayan() {
        super();
    }

    // Konstruktor berparameter
    public Pelayan(String nama, java.time.LocalDate tglLahir, java.time.LocalDate tmt, double gaji) {
        super(nama, tglLahir, tmt, gaji);
    }

    /* METHOD */
    @Override
    public double hitungTunjangan() {
        return 0.05 * gajiPokok;
    }

    @Override
    public void printInfo() {
        //Format uang Indonesia
        Locale indo = new Locale("id", "ID");
        System.out.println("=== PELAYAN ===");
        super.printInfo();
        System.out.println("Jabatan             : Pelayan");
        System.out.printf(indo, "Tunjangan           : 5%% x Rp %,.2f = Rp %,.2f\n", this.gajiPokok, hitungTunjangan());
    }
}