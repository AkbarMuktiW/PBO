import java.time.LocalDate;
import java.time.Period;

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
    public KokiKontrak(String nama, LocalDate tglLahir, LocalDate tmt,
                        double gaji, String spesialisasi, LocalDate tglAkhir) {
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
        System.out.println("=== KOKI KONTRAK ===");
        super.printInfo();
        System.out.println("Akhir Kontrak : " + tglAkhirKontrak);
        System.out.println("Sisa Kontrak  : " + getMasaKontrak());
        System.out.println("Tunjangan     : " + hitungTunjangan());
    }
}