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
        System.out.println("=== PELAYAN ===");
        super.printInfo();
        System.out.println("Tunjangan : " + hitungTunjangan());
    }
}