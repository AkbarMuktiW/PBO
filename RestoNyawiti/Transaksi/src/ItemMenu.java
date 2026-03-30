public class ItemMenu {
    private String idMenu;
    private String nama;
    private double harga;
    private String kategori;

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