package Module02.problem01;

public class Fruit {
    private String fruitName;
    private Double weight;
    private Double price;
    private Double purchaseTotal;
    private Double pricePerKg;

    public Fruit (String fruitName, Double weight,  Double price, Double purchaseTotal){
        this.fruitName = fruitName;
        this.weight = weight;
        this.price = price;
        this.purchaseTotal=purchaseTotal;
        this.pricePerKg = this.price / this.weight;
    }


    public void printInfo() {

        System.out.println("Nama Buah: " + this.fruitName);
        System.out.println("Berat: " + this.weight);
        System.out.println("Harga: " + this.price);
        System.out.printf("Jumlah Beli: %.1fkg\n", this.purchaseTotal);
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", getPreDiscountPrice());
        System.out.printf("Total Diskon: Rp%.2f\n", getDiscountTotal());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", getPostDiscountPrice());
    }

    public double getPreDiscountPrice() {
        return this.price / this.weight* this.purchaseTotal;
    }

    public double getDiscountTotal() {
        int discountThresholdKg = 4;
        double discountPercentage = 0.02;

        int discountBatches = (int)(this.purchaseTotal / discountThresholdKg);
        return discountBatches * (discountThresholdKg * this.pricePerKg) * discountPercentage;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}