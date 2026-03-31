/*  Anggota Kelompok:
*   Akbar Mukti Wibowo				24060124130063
*   Farras Hilmy Zaidan 			24060124120003
*   Agil Yudis Wibawa 				24060124120045
*   Aufaarel Nabiil Aryadh Mecca 	24060124140206
*   Fakhri Ali Azadi				24060123140128
*/

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public class KokiTetap extends Koki {
    /* ATRIBUT */
    private String sertifikatNasional;

    /* KONSTRUKTOR */
    // Konstruktor kosong
    public KokiTetap() {
        super();
        this.sertifikatNasional = "";
    }

    // Konstruktor berparameter
    public KokiTetap(String nama, LocalDate tglLahir, LocalDate tmt, double gaji, String spesialisasi, String sertifikat) {
        super(nama, tglLahir, tmt, gaji, spesialisasi);
        this.sertifikatNasional = sertifikat;
    }

    /* GETTER SETTER */
    // Getter
    public String getSertifikatNasional() {
        return sertifikatNasional;
    }

    // Setter
    public void setSertifikatNasional(String s) {
        this.sertifikatNasional = s;
    }

    /* METHOD */
    @Override
    public double hitungTunjangan() {
        int masaKerja = Period.between(tmt, LocalDate.now()).getYears();
        return 0.02 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo() {
        int masaKerja = Period.between(tmt, LocalDate.now()).getYears();
        System.out.println("=== KOKI TETAP ===");
        super.printInfo();
        System.out.println("Sertifikat Nasional : " + sertifikatNasional);
        System.out.printf(new Locale("id", "ID"), "Tunjangan           : 2%% x %d (tahun) x Rp %,.2f = Rp %,.2f\n", masaKerja, this.gajiPokok, hitungTunjangan());
    }
}