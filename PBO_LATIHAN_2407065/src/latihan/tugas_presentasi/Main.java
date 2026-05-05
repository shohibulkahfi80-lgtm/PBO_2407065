package latihan.tugas_presentasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cafe myCafe = new Cafe("Cafe Teknik Informatika");

        // h. Membuat beberapa menu dan memasukkan ke dalam cafe
        myCafe.tambahMenu(new Makanan("Nasi Goreng Spesial", 25000, "Makanan Utama"));
        myCafe.tambahMenu(new Makanan("Kentang Goreng", 15000, "Cemilan"));
        myCafe.tambahMenu(new Minuman("Kopi Hitam", 12000, "Hot"));
        myCafe.tambahMenu(new Minuman("Es Teh Manis", 8000, "Cold/Large"));

        double totalHarga = 0;
        boolean isSelesai = false;

        while (!isSelesai) {
            System.out.println("\n--- Sistem Pemesanan ---");
            System.out.println("1. Lihat Daftar Menu");
            System.out.println("2. Pesan Menu");
            System.out.println("3. Selesai & Bayar");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = scanner.nextInt();

            // i. Penggunaan struktur percabangan (switch & if)
            switch (pilihan) {
                case 1:
                    // h. Menampilkan daftar menu
                    myCafe.tampilkanMenu();
                    break;
                case 2:
                    myCafe.tampilkanMenu();
                    System.out.print("Masukkan nomor menu yang ingin dipesan: ");
                    int nomorPesanan = scanner.nextInt();
                    
                    // Validasi input
                    if (nomorPesanan > 0 && nomorPesanan <= myCafe.getJumlahMenu()) {
                        Menu pesanan = myCafe.getMenuByIndex(nomorPesanan - 1);
                        totalHarga += pesanan.getHarga(); // h. Menghitung total harga
                        System.out.println("--> Berhasil menambahkan '" + pesanan.getNama() + "' ke keranjang.");
                    } else {
                        System.out.println("--> [Error] Nomor menu tidak valid!");
                    }
                    break;
                case 3:
                    System.out.println("\n=== Struk Pembayaran ===");
                    System.out.println("Total Tagihan Anda : Rp" + totalHarga);
                    System.out.println("Terima kasih atas kunjungannya!");
                    isSelesai = true;
                    break;
                default:
                    System.out.println("--> [Error] Pilihan tidak dikenali.");
            }
        }
        scanner.close();
    }
}
