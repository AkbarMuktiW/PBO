/*  Anggota Kelompok:
*   Akbar Mukti Wibowo				24060124130063
*   Farras Hilmy Zaidan 			24060124120003
*   Agil Yudis Wibawa 				24060124120045
*   Aufaarel Nabiil Aryadh Mecca 	24060124140206
*   Fakhri Ali Azadi				24060123140128
*/

public class ItemMenu {
    /* ATRIBUT */
    private String idMenu;
    private String nama;
    private double harga;
    private String kategori;

    /* KONSTRUKTOR */
    public ItemMenu() {
    }

    public ItemMenu(String id, String nama, double harga, String kat) {
        this.idMenu = id;
        this.nama = nama;
        this.harga = harga;
        this.kategori = kat;
    }
    
    /* GETTER SETTER */
    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setKategori(String kat) {
        this.kategori = kat;
    }

    //getter
    public String getIdMenu() {
        return idMenu;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }

}