// Kelas Induk
public class MenuItem {
    private String nama;
    private double harga;

    // Konstruktor Default (Overloading)
    public MenuItem() {
        this.nama = "Tidak Diketahui";
        this.harga = 0.0;
    }

    // Konstruktor Parameter
    public MenuItem(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Metode Umum
    public void displayMenu() {
        System.out.println("Menu Item: " + nama + ", Harga: $" + harga);
    }
}