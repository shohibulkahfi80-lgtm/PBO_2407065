package latihan.tugas_presentasi;

public class Makanan extends Menu {
    private String jenis; // Contoh: Makanan Utama, Cemilan, Penutup

    public Makanan(String nama, double harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }

    // c. Override method dari super class
    @Override
    public void detailMenu() {
        System.out.println("[Makanan] " + getNama() + " (" + jenis + ") | Harga: Rp" + getHarga());
    }
}