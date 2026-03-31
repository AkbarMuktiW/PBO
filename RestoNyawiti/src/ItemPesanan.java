/*  Anggota Kelompok:
*   Akbar Mukti Wibowo				24060124130063
*   Farras Hilmy Zaidan 			24060124120003
*   Agil Yudis Wibawa 				24060124120045
*   Aufaarel Nabiil Aryadh Mecca 	24060124140206
*   Fakhri Ali Azadi				24060123140128
*/

public class ItemPesanan {
    /* ATRIBUT */
    private ItemMenu menu;
    private int qty;

    /* KONSTRUKTOR */
    public ItemPesanan(ItemMenu m, int q) {
        // ASERSI: memastikan jumlah pesanan tidak boleh nol atau negatif
        assert q > 0 : "Error: Jumlah pesanan (qty) harus lebih dari 0!";
        this.menu = m;
        this.qty = q;
    }

    /* GETTER SETTER */
    //setter
    public void setQty(int q) { 
        assert q > 0 : "Qty tidak valid";
        this.qty = q; 
    }

    //getter
    public ItemMenu getMenu() {
        return menu;
    }

    public int getQty() {
        return qty;
    }
    
    /* METHOD */
    public double subTotal() {
        return menu.getHarga() * qty;
    }
}