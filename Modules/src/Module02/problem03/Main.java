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
        //output yang dinginkan bukan "Nama pegawai",melainkan "Nama"
        //System.out.println("Nama Pegawai: " + e.getName());
        System.out.println("Nama: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        //tidak mencetak kata "Tahun" diujung teks output
        //System.out.println("Umur: " + e.age);
        System.out.println("Umur: " + e.age+ "Tahun");
    }
}