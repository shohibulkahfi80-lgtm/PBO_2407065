package latihan.tugas_presentasi;

import java.util.ArrayList;

public class Cafe {
    private String namaCafe;
    // f. Polymorphism: ArrayList menyimpan objek Makanan dan Minuman dalam tipe Menu
    private ArrayList<Menu> daftarMenu; 

    public Cafe(String namaCafe) {
        this.namaCafe = namaCafe;
        this.daftarMenu = new ArrayList<>();
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public void tampilkanMenu() {
        System.out.println("\n=== Daftar Menu " + namaCafe + " ===");
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.print((i + 1) + ". ");
            // f. Polymorphism saat memanggil detailMenu() sesuai dengan tipe objek aslinya
            daftarMenu.get(i).detailMenu(); 
        }
    }

    public Menu getMenuByIndex(int index) {
        if (index >= 0 && index < daftarMenu.size()) {
            return daftarMenu.get(index);
        }
        return null;
    }

    public int getJumlahMenu() {
        return daftarMenu.size();
    }
}