package polimorfisme;

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(final double sisi){
        this.sisi = sisi;
    }
    @Override
    public double hitungluas(){
        return sisi * sisi;
    }
    @Override
    public double hitungKeliling(){
        return 4 * sisi;
    }
}
