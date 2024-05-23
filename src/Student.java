import java.util.ArrayList;

public class Student {
    private int studentID;
    private String name;

    public Student (int studentID, String name){
        this.studentID = studentID;
        this.name = name;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "ID: " + studentID + ", Name: " + name;
    }
}
