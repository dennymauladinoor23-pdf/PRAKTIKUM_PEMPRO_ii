package module04.problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice = input.nextInt();
        input.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String name = input.nextLine();
        System.out.print("Ras: ");
        String breed = input.nextLine();
        System.out.print("Warna Bulu: ");
        String furColor = input.nextLine();

        if (choice == 1) {
            Cat cat = new Cat(breed, name, furColor);
            cat.displayCatDetails();
        } else {
            System.out.print("Kemampuan : ");
            String[] abilities = input.nextLine().split(",");
            Dog dog = new Dog(name, breed, furColor, abilities);
            dog.displayDogDetails();
        }
    }
}
