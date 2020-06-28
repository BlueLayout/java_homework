package main;

import model.Student;

/**
 * @author devin
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Wang");
        student.setLastName("xiaoming");
        student.setAge(11);
        student.setGender("male");
        student.setiDNo("1111111111111111111111111111111111111");

        System.out.println(student.printInfo());
    }
}
