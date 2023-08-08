package Student_Information_System;
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ilber Ortaylı","+9505123456789", "TRH" );
        Teacher t2 = new Teacher("Dize Kayacı","+440000000", "MAT");
        Teacher t3 = new Teacher("Alihan White","+990000000", "CHEM");

        Course history = new Course("History", "101", "TRH", t1);
        Course mathematics = new Course("Mathematics", "101", "MAT",t2);
        Course chemistry = new Course("Chemistry", "101", "CHEM", t3);

        history.addTeacher(t1);
        mathematics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Akaki Akakiyeviç", "578","6", history,mathematics,chemistry);
        s1.addBulkExamNotes(100,15,75);


        Student s2 = new Student("Lilith", "666","1", history,mathematics,chemistry);
        s2.addBulkExamNotes(55, 25, 62);

        Student s3 = new Student("Diablo", "2023","4", history,mathematics,chemistry);
        s3.addBulkExamNotes(100, 55, 7);


        s1.printNotes();
        t2.TeacherInfo();


    }
}
