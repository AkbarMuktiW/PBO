/*  Anggota Kelompok:
*   Akbar Mukti Wibowo				24060124130063
*   Farras Hilmy Zaidan 			24060124120003
*   Agil Yudis Wibawa 				24060124120045
*   Aufaarel Nabiil Aryadh Mecca 	24060124140206
*   Fakhri Ali Azadi				24060123140128
*/

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