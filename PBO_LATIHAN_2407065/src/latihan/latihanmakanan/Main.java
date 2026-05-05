package latihan.latihanmakanan;

public class Main {
    public static void main(String[] args) {

        Menu menu1 = new MenuItem("ketoprak", 13000, 10);
        Menu menu2 = new MenuItem("batagor", 10000, 2);
        Menu menu3 = new MenuItem("pangsit", 15000, 4);

        int total = 0;

        menu1.tampilkan();
        total += menu1.hitungTotal();

        menu2.tampilkan();
        total += menu2.hitungTotal();

        menu3.tampilkan();
        total += menu3.hitungTotal();

        System.out.println("-------------------------------------");
        System.out.println("total = " + total);
    }
}