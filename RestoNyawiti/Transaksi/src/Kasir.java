public class Kasir extends StafOperasional {
    /* ATRIBUT */
    private String kodeSertifikasi;

    /* KONSTRUKTOR */
    // Konstruktor kosong
    public Kasir() {
        super();
        this.kodeSertifikasi = "";
    }

    // Konstruktor berparameter
    public Kasir(String nama, java.time.LocalDate tglLahir, java.time.LocalDate tmt, double gaji, String kode) {
        super(nama, tglLahir, tmt, gaji);
        this.kodeSertifikasi = kode;
    }

    /* GETTER SETTER */
    // Getter
    public String getKodeSertifikasi() {
        return kodeSertifikasi;
    }

    // Setter
    public void setKodeSertifikasi(String kode) {
        this.kodeSertifikasi = kode;
    }

    /* METHOD */
    @Override
    public double hitungTunjangan() {
        return 0.10 * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("=== KASIR ===");
        super.printInfo();
        System.out.println("Kode Sertifikasi : " + kodeSertifikasi);
        System.out.println("Tunjangan        : " + hitungTunjangan());
    }
}