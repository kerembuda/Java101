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

    void addBulkExamNotes(int note1, int note2, int note3, int vNote1, int vNote2, int vNote3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if ((vNote1 >= 0 && vNote1 <= 100)) {
            this.c1.vocalNote = vNote1;
        }
        if ((vNote2 >= 0 && vNote2 <= 100)) {
            this.c2.vocalNote = vNote2;
        }
        if ((vNote3 >= 0 && vNote3 <= 100)) {
            this.c3.vocalNote = vNote3;
            System.out.println(this.c3.vocalNote);
        }
    }

    void isCoursePass() {
        double c1Note = 0;
        double c2Note = 0;
        double c3Note = 0;
        c1Note = (this.c1.note * 0.80) + (this.c1.vocalNote * 0.20);
        c2Note = (this.c2.note * 0.80) + (this.c2.vocalNote * 0.20);
        c3Note = (this.c3.note * 0.80) + (this.c3.vocalNote * 0.20);
        this.average = (c1Note + c2Note + c3Note) / 3.0;
        if (this.average >= 55) isClassPass = true;
    }

    void printNotes() {
        System.out.println(this.c1.name + " Note\t\t= " + this.c1.note);
        System.out.println(this.c2.name + " Note\t= " + this.c2.note);
        System.out.println(this.c3.name + " Note\t\t= " + this.c3.note);
        System.out.println("Average note\t\t=" + this.average);
        if (isClassPass) {
            System.out.println("You have passed the class successfully! :)");
        } else {
            System.out.println("You have failed the class!!! Try harder next year!");
        }

    }
}
