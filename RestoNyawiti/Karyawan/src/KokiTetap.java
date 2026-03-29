import java.time.LocalDate;
import java.time.Period;

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
        System.out.println("=== KOKI TETAP ===");
        super.printInfo();
        System.out.println("Sertifikat Nasional : " + sertifikatNasional);
        System.out.println("Tunjangan           : " + hitungTunjangan());
    }
}