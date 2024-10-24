// Kelas Anak
public class Dessert extends MenuItem {
    private int kandunganGula; // dalam gram

    // Konstruktor Overloading
    public Dessert() {
        super();
        this.kandunganGula = 0;
    }

    public Dessert(String nama, double harga, int kandunganGula) {
        super(nama, harga);
        this.kandunganGula = kandunganGula;
    }

    // Getter dan Setter
    public int getKandunganGula() {
        return kandunganGula;
    }

    public void setKandunganGula(int kandunganGula) {
        this.kandunganGula = kandunganGula;
    }

    // Overriding Method
    @Override
    public void displayMenu() {
        System.out.println("Dessert: " + getNama() + ", Harga: $" + getHarga() + ", Kandungan Gula: " + kandunganGula + "g");
    }

    // Metode Tambahan
    public void hias() {
        System.out.println("Menghias " + getNama());
    }
}