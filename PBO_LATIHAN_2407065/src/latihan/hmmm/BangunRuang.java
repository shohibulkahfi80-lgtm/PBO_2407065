package latihan.hmmm;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    // 🔥 overriding method dari parent
    @Override
    public double hitungLuas() {
        System.out.println("Menghitung luas alas di BangunRuang...");
        return panjang * lebar;
    }

    public double hitungVolume(){
        return hitungLuas()*tinggi;
    }

    public double hitungVolume2(){
        return hitungLuas()*tinggi;
    }

    public void tampilkanInfoRuang(){
        super.tampilkanHasil();
        System.out.println("Tinggi : " + tinggi);
    }
}