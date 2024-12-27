package encapsulation;

public class Client {

    public static void main(String[] args) {

        Student s = new Student();
        s.id = 1;
        s.marks = 100;
        s.name ="Sana";

        s.printDetails();

//        We are able to access the student variables, inside class & package
//        since their access modifier is default

        StudentPrivate sp = new StudentPrivate();
//        s.id = 1; -> s.id not working for private access modifiers
        sp.setId(1);
        sp.setName("Sahana");
        sp.setMarks(98);
//        sp.printDetails();

        System.out.println(sp.getId());
        System.out.println(sp.getName());
        System.out.println(sp.getMarks());




    }



}
