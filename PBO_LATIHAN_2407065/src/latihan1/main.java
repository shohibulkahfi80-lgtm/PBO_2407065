package latihan1;

// import java.util.Scanner;

class Cafe {
    String nama;
    String alamat;

    // Constructor
    Cafe(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        System.out.println(nama);
        System.out.println(alamat);    
    }

    // No-arg constructor
   // Cafe() {
     //   this.nama = "default nama";
     //   this.alamat = "default alamat";
     //   System.out.println("nama cafe adalah " + this.nama);
    //    System.out.println("alamat cafe adalah " + this.alamat);
  //  }

    // Method
    void buka() {
        System.out.println("Cafe buka pada pukul 08.00");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


}

public class Main {
    public static void main(String[] args) {

       // scanner input = new Scanner(System.in)) {
       //     Cafe cafe = new Cafe();

         //   System.out.println("Masukkan nama cafe: ");
         //   cafe.setNama(input.nextLine());

         //   System.out.println("nama yang di input adalah : " + cafe.nama);
         //   cafe.buka();
        

        Cafe cafe2 = new Cafe("Kopi Kenangan", "Jl. Merdeka No. 10");
        cafe2.setNama("Kopi Kenangan");
        cafe2.buka();

    }
}
