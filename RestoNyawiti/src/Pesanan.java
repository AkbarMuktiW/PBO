import java.util.ArrayList;
import java.util.List;

public class Pesanan {
    /* ATRIBUT*/
    private String idPesanan;
    private List<ItemPesanan> daftarItem;

    /* KONSTRUKTOR */
    public Pesanan(String id) {
        this.idPesanan = id;
        this.daftarItem = new ArrayList<>();
    }

    public String getIdPesanan() {
        return idPesanan;
    }

    public List<ItemPesanan> getDaftarItem() {
        return daftarItem;
    }

    public void tambahItem(ItemMenu menu) throws MenuException {
        tambahItem(menu, 1);
    }

    public void tambahItem(ItemMenu menu, int qty) throws MenuException {
        assert qty > 0 : "Jumlah pesanan tidak boleh nol atau negatif!";
        
        if (menu == null) {
            throw new MenuException("Error: Item menu tidak valid atau tidak ditemukan di sistem!");
        }
        
        daftarItem.add(new ItemPesanan(menu, qty));
    }

    public double hitungTotal() {
        double total = 0;
        for (ItemPesanan item : daftarItem) {
            total += item.subTotal();
        }
        return total;
    }
}