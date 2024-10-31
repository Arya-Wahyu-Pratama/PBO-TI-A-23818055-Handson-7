package polimorfisme;

public class Lingkaran extends BangunDatar{
    private double jarijari;

    public Lingkaran(final double jarijari) {
        this.jarijari = jarijari;

    }
    @Override
    public double hitungluas() {
        return Math.PI * jarijari * jarijari;
    }
}
