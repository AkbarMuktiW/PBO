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
        System.out.println("=== STAF OPERASIONAL ===");
        super.printInfo();
    }
}