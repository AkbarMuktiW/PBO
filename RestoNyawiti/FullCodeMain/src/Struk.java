public class Struk {
    /* ATRIBUT */
    private double bayar;
    private double kembali;
    private double pajak;
    private double diskon;

    /* KONSTRUKTOR */
    public Struk(double b, double km, double p, double d) {
        this.bayar = b;
        this.kembali = km;
        this.pajak = p;
        this.diskon = d;
    }

    /* GETTER */
    public double getBayar() {
        return bayar;
    }

    public double getKembali() {
        return kembali;
    }

    public double getPajak() {
        return pajak;
    }

    public double getDiskon() {
        return diskon;
    }

    /* METHOD */
    public void cetak() {
        System.out.println("======================================");
        System.out.println("          BUKTI PEMBAYARAN            ");
        System.out.println("======================================");
        System.out.printf("Pajak (12%%)   : Rp%.0f\n", pajak);
        if (diskon > 0) {
            System.out.printf("Diskon (5%%)   :-Rp%.0f\n", diskon);
        }
        System.out.println("--------------------------------------");
        System.out.printf("TUNAI         : Rp%.0f\n", bayar);
        System.out.printf("KEMBALIAN     : Rp%.0f\n", kembali);
        System.out.println("======================================\n");
    }
}