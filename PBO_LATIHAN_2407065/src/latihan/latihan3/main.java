package latihan.latihan3;

public class main {
    public static void main(String[] args) {

        BangunRuang coba = new BangunRuang();

        System.out.println("===SISI1 BANGUN RUANG===");
        coba.setSisi(25);
        System.out.println(coba.getSisi());
        
        System.out.println("===SISI2 BANGUN RUANG===");
        coba.alas = 27;
        System.out.println(coba.alas);

        System.out.println("===PANJANG BANGUN RUANG===");
        coba.setPanjang(5);
        System.out.println(coba.getPanjang());


    }
}