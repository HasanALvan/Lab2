package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {

        Professor Kayhan = new Professor("Kayhan","Erciyes");

        Student Hasan = new Student("Hasan","ALVAN",190704006);

        Hasan.enroll_class("SE 240");
        Kayhan.setclass("Digital System Design");
        Kayhan.teach();
    }
}
