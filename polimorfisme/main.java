package polimorfisme;

public class main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;

        bangunDatar = new Persegi(4);

        bangunDatar = new SegitigaSamaSisi(5, 6);

        bangunDatar = new Lingkaran(7);
    }

    public static void tammpilkanPerhitungan(double luas, double keliling, String namaBangunDatar) {
        System.out.println("Luas bangun datar" + namaBangunDatar + " " + luas);
        System.out.println("Keliling bangun datar" + namaBangunDatar + keliling);
    }
}