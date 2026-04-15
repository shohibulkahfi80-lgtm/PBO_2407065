package latihan.polymorphism;

public class Main {
    public static void main(String[] args) {

        // 1 tipe variabel untuk semua objek (polymorphism)
        BangunDatar bd;

        bd = new Persegi(4);
        bd.tampilkan();
        System.out.println();

        bd = new PersegiPanjang(5, 3);
        bd.tampilkan();
        System.out.println();

        bd = new Segitiga(6, 4);
        bd.tampilkan();
    }
}