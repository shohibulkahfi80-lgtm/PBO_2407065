package latihan.tugas_presentasi;

public class Menu {
    // d. Semua atribut private (Encapsulation)
    private String nama;
    private double harga;

    // e. Konsep Overloading pada Constructor
    public Menu() {
        this.nama = "Belum ada nama";
        this.harga = 0.0;
    }

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    // e. Konsep Overloading pada Setter
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setHarga(String hargaStr) {
        this.harga = Double.parseDouble(hargaStr); // Overloading setter dengan tipe data String
    }

    // a. Method detail menu
    public void detailMenu() {
        System.out.println("Nama Menu: " + nama + " | Harga: Rp" + harga);
    }
}