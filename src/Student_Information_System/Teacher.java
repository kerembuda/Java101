package Student_Information_System;

public class Teacher {
    String name;
    String telNo;
    String branch;

    Teacher(String name, String telNo, String branch) {
        this.name = name;
        this.telNo = telNo;
        this.branch = branch;
    }

    void TeacherInfo() {
        System.out.println("Teacher Name\t\t:" + this.name);
        System.out.println("Teacher Mobile Phone:" + this.telNo);
        System.out.println("Teacher Branch\t\t:" + this.branch);
    }
}
