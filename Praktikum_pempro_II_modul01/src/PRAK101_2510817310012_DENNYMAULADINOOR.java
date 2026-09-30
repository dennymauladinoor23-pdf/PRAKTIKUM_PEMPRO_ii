import java.util.Locale;
import java.util.Scanner;

public class PRAK101_2510817310012_DENNYMAULADINOOR {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String name = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String placeofBirth = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int birthDate = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int birthMonth = input.nextInt();

        System.out.print("Masukan Tahun Lahir: ");
        int birthYear = input.nextInt();

        System.out.print("Masukan Tinggi Badan: ");
        int height = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double weight = input.nextDouble();

        String monthName = switch (birthMonth) {
            case 1 -> "Januari";
            case 2 -> "Februari";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Month invalid";
        };

        System.out.println("Nama Lengkap "+name+", Lahir di "+placeofBirth+" pada Tanggal "+birthDate+" "+monthName+" "+birthYear+" \nTinggi Badan "+ height+" dan Berat Badan "+weight);
    }
}
