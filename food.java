// Kelas Anak
public class Food extends MenuItem {
    private int kalori;

    // Konstruktor Overloading
    public Food() {
        super();
        this.kalori = 0;
    }

    public Food(String nama, double harga, int kalori) {
        super(nama, harga);
        this.kalori = kalori;
    }

    // Getter dan Setter
    public int getKalori() {
        return kalori;
    }

    public void setKalori(int kalori) {
        this.kalori = kalori;
    }

    // Overriding Method
    @Override
    public void displayMenu() {
        System.out.println("Makanan: " + getNama() + ", Harga: $" + getHarga() + ", Kalori: " + kalori + "kcal");
    }

    // Metode Tambahan
    public void siapkan() {
        System.out.println("Menyiapkan " + getNama());
    }
}