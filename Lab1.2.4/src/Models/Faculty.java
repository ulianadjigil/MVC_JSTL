package Models;
import java.util.ArrayList;

public class Faculty {
    private String name;
    private ArrayList<Student> students;

    public Faculty(String name, ArrayList<Student> students){
        this.name = name;
        this.students = students;
    }

    public ArrayList<Student> getStudents(){
        return (ArrayList<Student>) students.clone();
    }

    public String getName(){
        return name;
    }
}
