package Module03.problem03;

public class Student {
    private String name;
    private String nim;

    public Student(String name, String id) {
        this.name = name;
        this.nim = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return nim;
    }
}