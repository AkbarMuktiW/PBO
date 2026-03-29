import java.time.LocalDate;
import java.time.Period;

public abstract class Karyawan {
    /* ATRIBUT */
    protected String nik;
    protected String nama;
    protected LocalDate tglLahir;
    protected LocalDate tmt;
    protected double gajiPokok;
    protected static int totalPegawai = 0;

    /* KONSTRUKTOR */
    // Konstruktor kosong
    public Karyawan() {
        this.nama = "";
        this.tglLahir = LocalDate.now();
        this.tmt = LocalDate.now();
        this.gajiPokok = 0;

        totalPegawai++;
        this.nik = generateNIK(LocalDate.now());
    }

    // Konstruktor berparameter
    public Karyawan(String nama, LocalDate tglLahir, LocalDate tmt, double gaji) {
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gaji;

        totalPegawai++;
        this.nik = generateNIK(tmt);
    }

    private String generateNIK(LocalDate tmt) {
        String tahun = String.valueOf(tmt.getYear());
        String bulan = String.format("%02d", tmt.getMonthValue());
        String urutan = String.format("%03d", totalPegawai);
        return tahun + bulan + urutan;
    }

    /* GETTER SETTER*/
    // getter
    public String getNIK() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTglLahir() {
        return tglLahir;
    }

    public LocalDate getTMT() {
        return tmt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public static int getTotalPegawai() {
        return totalPegawai;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglLahir(LocalDate tglLahir) {
        this.tglLahir = tglLahir;
    }

    public void setTMT(LocalDate tmt) {
        this.tmt = tmt;
    }

    public void setGajiPokok(double gaji) {
        this.gajiPokok = gaji;
    }

    /* METHOD */
    public abstract double hitungTunjangan();
    public abstract int hitungBUP();

    public String hitungMasaKerja() {
        Period p = Period.between(tmt, LocalDate.now());
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    public LocalDate hitungTanggalPensiun() {
        return tglLahir.plusYears(hitungBUP());
    }

    public void printInfo() {
        System.out.println("NIK           : " + nik);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.println("TMT           : " + tmt);
        System.out.println("Gaji Pokok    : " + gajiPokok);
        System.out.println("Masa Kerja    : " + hitungMasaKerja());
        System.out.println("Pensiun       : " + hitungTanggalPensiun());
    }
}