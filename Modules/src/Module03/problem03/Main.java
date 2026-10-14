package Module03.problem03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            int option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1:

                    System.out.print("Masukan Nama Mahasiswa: ");
                    String name = input.nextLine();
                    System.out.print("Masukan NIM Mahasiswa(harus unik): ");
                    String nim = input.nextLine();

                    boolean doesIdAlreadyExit = false;
                    for(Student theStudent : students){
                        if(theStudent.getId().equals(nim)){
                            doesIdAlreadyExit = true;
                        }
                    }

                     if (doesIdAlreadyExit){
                         System.out.println("NIM yang sama sudah terdaftar");
                     }else {
                         students.add(new Student(name, nim));
                         System.out.println("Masukan Nama Mahasiswa: " + name+ " Ditambahkan");

                     }

                    break;

                case 2:

                    System.out.print("Masukan NIM Mahasiswa yang akan dihapus:");
                    String deleteId = input.nextLine();

                    boolean isIdFound = false;
                    for(int i = 0; i < students.size(); i++){
                        if(students.get(i).getId().equals(deleteId)){
                            isIdFound = true;
                            students.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + deleteId + " dihapus.");
                        }
                    }
                    if(!isIdFound){
                        System.out.println("Mahasiswa dengan NIM " + deleteId + " tidak ditemukan.");
                    }
                    break;

                case 3:

                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String idSearch = input.nextLine();

                    boolean isIdSearchFound = false;
                    for(Student thestudent : students){
                        if (thestudent.getId().equals(idSearch)){
                            isIdSearchFound = true;
                            System.out.println("NIM: " + thestudent.getId() + ", Nama: " + thestudent.getName());                        }
                    }
                    break;

                case 4:

                    System.out.println("Daftar Mahasiswa:");
                    for(Student thestudents : students){
                        System.out.println("NIM :" + thestudents.getId()+ ", Nama: " + thestudents.getName());
                    }
                    break;

                case 0:

                    students.clear();
                    System.out.println("Terima kasih!");

                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}