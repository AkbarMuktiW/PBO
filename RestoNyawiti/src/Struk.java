/*  Anggota Kelompok:
*   Akbar Mukti Wibowo				24060124130063
*   Farras Hilmy Zaidan 			24060124120003
*   Agil Yudis Wibawa 				24060124120045
*   Aufaarel Nabiil Aryadh Mecca 	24060124140206
*   Fakhri Ali Azadi				24060123140128
*/

import java.util.Locale;

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
        //Format uang Indonesia
        Locale indo = new Locale("id", "ID");
        System.out.printf(indo, "Pajak (12%%)     : Rp %,.2f\n", pajak);
        if (diskon > 0) {
            System.out.printf(indo, "Diskon (5%%)     :-Rp %,.2f\n", diskon);
        }
        double totalAkhir = this.bayar - this.kembali;
        System.out.printf(indo, "Total Akhir     : Rp %,.2f\n", totalAkhir);
        System.out.println("--------------------------------------");
        System.out.printf(indo, "Tunai           : Rp %,.2f\n", bayar);
        System.out.printf(indo, "Kembali         : Rp %,.2f\n", kembali);
        System.out.println("======================================\n");
    }
}