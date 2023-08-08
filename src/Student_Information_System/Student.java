package Student_Information_System;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String studentNo;
    String year;
    Double average;
    boolean isClassPass;

    Student(String name, String studentNo, String year, Course c1, Course c2, Course c3) {
        this.name = name;
        this.studentNo = studentNo;
        this.year = year;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isClassPass = false;
    }
    void addBulkExamNotes(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void printNotes() {
        System.out.println(this.c1.name + " Note\t\t= "+ this.c1.note);
        System.out.println(this.c2.name + " Note\t= "+ this.c2.note);
        System.out.println(this.c3.name + " Note\t\t= "+ this.c3.note);
    }
}
