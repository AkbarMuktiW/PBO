/*  Anggota Kelompok:
*   Akbar Mukti Wibowo				24060124130063
*   Farras Hilmy Zaidan 			24060124120003
*   Agil Yudis Wibawa 				24060124120045
*   Aufaarel Nabiil Aryadh Mecca 	24060124140206
*   Fakhri Ali Azadi				24060123140128
*/

import java.time.LocalDate;

public class Koki extends Karyawan {
    /* ATRIBUT */
    protected String spesialisasi;

    /* KONSTRUKTOR */
    // konstruktor kosong
    public Koki() {
        super();
        this.spesialisasi = "";
    }

    // konstruktor berparameter
    public Koki(String nama, LocalDate tglLahir, LocalDate tmt, double gaji, String spesialisasi) {
        super(nama, tglLahir, tmt, gaji);
        this.spesialisasi = spesialisasi;
    }

    /* GETTER SETTER */
    // getter
    public String getSpesialisasi() {
        return spesialisasi;
    }

    // setter
    public void setSpesialisasi(String s) {
        this.spesialisasi = s;
    }

    /* METHOD */
    @Override
    public double hitungTunjangan() {
        return 0.15 * gajiPokok;
    }

    @Override
    public int hitungBUP() {
        return 55;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Spesialisasi : " + spesialisasi);
    }
}