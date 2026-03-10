package latihan.latihan4keknya;

public class persegiPanjang extends bangunDatar {
    private double panjang;
    private double lebar;

    public persegiPanjang(double panjang, double lebar) {
        super("PERSEGI PANJANG");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
} 
    
