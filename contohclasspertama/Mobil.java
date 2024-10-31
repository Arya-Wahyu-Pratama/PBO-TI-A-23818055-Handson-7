package contohclasspertama;

public class Mobil {
    String warna;
    String merek;
    int kecepatanMaks;

    public Mobil(final String warna, final String merek, final int kecepatanMaks){
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }
    public void tampilkanInfo(){
        System.out.println(warna + "\t" + merek + "\t" + kecepatanMaks);
    }

}