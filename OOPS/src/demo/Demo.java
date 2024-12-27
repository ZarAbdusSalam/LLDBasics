package demo;

import encapsulation.Student;
import encapsulation.StudentPrivate;

public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.marks = 100;
        s.name ="Sana";

        s.printDetails();

        StudentPrivate sp = new StudentPrivate();
        sp.setId(1);
        sp.setName("Sahana");
        sp.setMarks(98);
        sp.printDetails();

        System.out.println(sp.getId());
        System.out.println(sp.getName());
        System.out.println(sp.getMarks());

//        we are getting error since access modifier is default, so we are not able to
//        access variables outside the package
//        make the variables public and private and see what happens
//        public -> able to access everywhere
//        private -> able to see error in client class as well

    }
}
