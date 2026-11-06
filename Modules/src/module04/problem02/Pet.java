package module04.problem02;

public class Pet {
    private String name;
    private String breed;

    public Pet(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + name);
        System.out.println("Dengan ras : " + breed);
    }
}