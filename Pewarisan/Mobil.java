package Pewarisan;

public class Mobil extends kendaraan{
    private int jumlahPintu;
    private String jenisBahanBakar;

    public Mobil(final String merek, final String model, final int tahunProduksi) {
        super(merek, model, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }
    public void infoMobil(){
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Jenis Bahan: " + jenisBahanBakar);
    }
}
