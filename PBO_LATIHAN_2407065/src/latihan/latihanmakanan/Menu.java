package latihan.latihanmakanan;

public class Menu {
    protected String nama;
    protected int harga;

    // Constructor
    public Menu(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method hitung
    public int hitungTotal() {
        return 0;
    }

    // Method tampilkan
    public void tampilkan() {
        System.out.println(nama + " " + harga);
    }
}