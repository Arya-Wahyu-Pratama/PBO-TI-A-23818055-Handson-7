package Pewarisan;

public class Motor extends kendaraan{
    private int kapasitasMesin;
    private String jumlahTransmisi;

    public Motor(final String merek, final String model, final int tahunProduksi) {
        super(merek, model, tahunProduksi);
        this.kapasitasMesin = tahunProduksi;
        this.jumlahTransmisi = "";
    }
    public void infoMotor(){
        System.out.println("Kapasitas Mesin: " + kapasitasMesin);
        System.out.println("Jumlah Transmisi: " + jumlahTransmisi);
    }
}
