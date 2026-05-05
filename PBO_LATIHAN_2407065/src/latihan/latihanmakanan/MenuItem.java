package latihan.latihanmakanan;

public class MenuItem extends Menu {
    private int jumlah;

    // Constructor
    public MenuItem(String nama, int harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public int hitungTotal() {
        return harga * jumlah;
    }

    @Override
    public void tampilkan() {
        System.out.println(nama + " " + harga + " x " + jumlah + " = " + hitungTotal());
    }
}