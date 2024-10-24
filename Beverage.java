// Kelas Anak
public class Beverage extends MenuItem {
    private double volume; // dalam liter

    // Konstruktor Overloading
    public Beverage() {
        super();
        this.volume = 0.0;
    }

    public Beverage(String nama, double harga, double volume) {
        super(nama, harga);
        this.volume = volume;
    }

    // Getter dan Setter
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    // Overriding Method
    @Override
    public void displayMenu() {
        System.out.println("Minuman: " + getNama() + ", Harga: $" + getHarga() + ", Volume: " + volume + "L");
    }

    // Metode Tambahan
    public void sajikan() {
        System.out.println("Menyajikan " + getNama());
    }
}