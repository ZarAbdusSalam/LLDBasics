package encapsulation;

public class StudentPrivate {

    private int id;
    private int marks;
    private String name;

    public void printDetails(){

        System.out.println(id);
        System.out.println(marks);
        System.out.println(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
