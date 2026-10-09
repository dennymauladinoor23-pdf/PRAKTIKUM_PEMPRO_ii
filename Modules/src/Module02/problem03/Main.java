package Module02.problem03;

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee();
        // terjadi error karena tidak ada semicoloum(;) di ujung kode
        //e.name = "Roi"
        e.name = "Roi";
        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");
        //tidak ada nilai untuk attribut age yang menjadikan output 0/Null
        //-
        e.age = 17;

        System.out.println("Nama Pegawai: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        System.out.println("Umur: " + e.age);
    }
}