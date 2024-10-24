// Kelas Induk
public class Customer {
    private String customerID;
    private String nama;

    // Konstruktor
    public Customer(String customerID, String nama) {
        this.customerID = customerID;
        this.nama = nama;
    }

    // Getter dan Setter
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode Umum
    public void lakukanPesanan() {
        System.out.println(nama + " sedang melakukan pemesanan.");
    }
}