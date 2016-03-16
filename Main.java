package Homework1;

public class Main {
    public static void main (String[] args){

        Exams examination = new Exams();

        examination.setName("OOP");
        examination.setSubject("Programming");
        examination.setExaminer("Dmitry Chabanenko");
        examination.setQuestion("What do you know about Intellij IDEA?");
        examination.setMark(5);

        System.out.println(examination.passed());

    }
}
