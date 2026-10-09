package Module02.problem03;

public class Employee {
    public String name;
    // kesalahan tipe data yang tidak sesuai dengan nilai yang dimasukan
    //public char origin;
    public String origin;
    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setRole(String r) {
        this.role = r;
    }
}