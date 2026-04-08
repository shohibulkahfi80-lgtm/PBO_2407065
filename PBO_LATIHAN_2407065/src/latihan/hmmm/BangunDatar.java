package latihan.hmmm;

public class BangunDatar {
    protected double panjang;
    protected double lebar;

    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar *2;
    }

    public void tampilkanHasil() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
    }
}