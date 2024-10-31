package Pewarisan;

public class kendaraan {
    private String merek;
    private String model;
    private int tahunProduksi;

    public kendaraan(String merek, String model, int tahunProduksi) {
        this.merek = merek;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    public void infoKendaraan() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}
