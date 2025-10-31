class hewan{
    private String nama;
    private String tipe;
    private String suara;

    hewan(String nama, String tipe, String suara){
        this.nama = nama;
        this.tipe = tipe;
        this.suara = suara;
    }
    public String getNama() {
        return nama;
    }
    public String getSuara() {
        return suara;
    }
    public String getTipe(){
        return tipe;
    }
    void tampilkanInfo(){
        System.out.println("Nama: " + getNama());
        System.out.println("Jenis: " + getTipe());
        System.out.println("Suara: " + getSuara() + "\n");
    }
}
public class Main{
    public static void main(String[] args){
        hewan animal1 = new hewan("Kucing", "Mamalia", "Nyann~~");
        hewan animal2 = new hewan("Anjing", "Mamalia", "Woof-Woof!!");

        animal1.tampilkanInfo();
        animal2.tampilkanInfo();
    }
}
