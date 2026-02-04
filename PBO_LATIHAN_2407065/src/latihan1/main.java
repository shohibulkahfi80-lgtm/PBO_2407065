package latihan1;

class Cafe {
    String nama;
    String alamat;

    // Constructor
    Cafe() {
        this.nama = "default nama";
        this.alamat = "default alamat";
        System.out.println("nama cafe adalah " + this.nama);
        System.out.println("alamat cafe adalah " + this.alamat);        

    }
}

public class main {
    public static void main(String[] args) {

        // Membuat objek
        Cafe cafe1 = new Cafe();

        // Mengubah data
        cafe1.nama = "Kopi Kenangan";
        cafe1.alamat = "Indramayu";

        // Output
        System.out.println("Praktikum pertama");
        System.out.println("Nama Cafe   : " + cafe1.nama);
        System.out.println("Alamat Cafe : " + cafe1.alamat);
    }
}
