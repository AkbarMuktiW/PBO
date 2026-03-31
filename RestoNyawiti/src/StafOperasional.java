/*  Anggota Kelompok:
*   Akbar Mukti Wibowo				24060124130063
*   Farras Hilmy Zaidan 			24060124120003
*   Agil Yudis Wibawa 				24060124120045
*   Aufaarel Nabiil Aryadh Mecca 	24060124140206
*   Fakhri Ali Azadi				24060123140128
*/

public class StafOperasional extends Karyawan {
    /* KONSTRUKTOR */
    // Konstruktor kosong
    public StafOperasional() {
        super();
    }

    // Konstruktor berparameter
    public StafOperasional(String nama, java.time.LocalDate tglLahir, java.time.LocalDate tmt, double gaji) {
        super(nama, tglLahir, tmt, gaji);
    }

    /* METHOD */
    @Override
    public int hitungBUP() {
        return 50;
    }

    @Override
    public double hitungTunjangan() {
        return 0;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}