package Student_Information_System;
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ilber Ortaylı","+9505123456789", "TRH" );

        Course history = new Course("History", "101", "TRH", t1);
        history.printTeacherInfo();
    }
}
