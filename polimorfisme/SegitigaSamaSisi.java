package polimorfisme;

public class SegitigaSamaSisi extends BangunDatar{

    private double sisi;
    private double tinggi;

    public SegitigaSamaSisi(final double sisi, final double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungluas() {
        return 0;
    }
    @Override
    public double hitungKeliling() {
        return 3 * sisi;
    }
}