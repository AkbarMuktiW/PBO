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