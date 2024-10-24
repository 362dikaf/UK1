// Main.java
public class Main {
    public static void main(String[] args) {
        // Instansiasi Objek dari Kelas Anak
        Food pizza = new Food("Pizza", 12.99, 800);
        Beverage cola = new Beverage("Cola", 1.99, 0.5);
        Dessert cake = new Dessert("Cake", 4.99, 50);

        // Instansiasi Objek dari Kelas Induk
        Customer customer1 = new Customer("C001", "Budi");

        // Polimorfisme: Referensi Kelas Induk MenuItem
        MenuItem[] menuItems = new MenuItem[3];
        menuItems[0] = pizza;
        menuItems[1] = cola;
        menuItems[2] = cake;

        // Menampilkan Menu dan Memanggil Metode yang Di-override
        System.out.println("---- Menu Restoran ----");
        for (MenuItem item : menuItems) {
            extracted(item);
        }

        // Menggunakan Setter dan Getter
        pizza.setKalori(850);
        System.out.println("\nUpdated Calories for Pizza: " + pizza.getKalori());

        // Memanggil Metode Tambahan
        System.out.println("\n---- Proses Pemesanan ----");
        customer1.lakukanPesanan(); // Memperbaiki nama metode
        pizza.siapkan();
        cola.sajikan();
        cake.hias();

        // Demonstrasi Overloading Konstruktor
        Food defaultFood = new Food();
        defaultFood.displayMenu();
    }

    private static void extracted(MenuItem item) {
        item.displayMenu();
    }
}