package Module02.problem02;

import java.util.Locale;

public class Coffee {
    private String name;
    private String size;
    private double price;
    private String customer;
    public void printInfo() {
        System.out.println("Nama Kopi: " + this.name);
        System.out.println("Ukuran: " + this.size);
        System.out.println("Harga: Rp. " + this.price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    // TODO: Buat 2 getter method sesuai Main.java
    public String getCustomer() {
        return this.customer;
    }

    public double getTax() {
        // Pajak sebesar 11% (0.11) dari harga
        return this.price * 0.11;
    }
}