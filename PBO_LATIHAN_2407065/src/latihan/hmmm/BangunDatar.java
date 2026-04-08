package latihan.hmmm;


public class BangunDatar {
    // atribut (enkapsulasi)
    private double panjang;
    private double lebar;

    // constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // getter (biar bisa diakses di turunan)
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    // method hitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }
}