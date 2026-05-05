package latihan.tugas_presentasi;

public class Minuman extends Menu {
    private String ukuran; // Contoh: Small, Medium, Large

    public Minuman(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    // c. Override method dari super class
    @Override
    public void detailMenu() {
        System.out.println("[Minuman] " + getNama() + " (" + ukuran + ") | Harga: Rp" + getHarga());
    }
}
