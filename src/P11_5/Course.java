package P11_5;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    
    public void addStudent(String student) { 
        students.add(student);
        numberOfStudents++;
    }
    
    public String[] getStudents() { 
        String[] arr = new String[students.size()];
        return students.toArray(arr);
    }
           
    public int getNumberOfStudents() { 
        return numberOfStudents;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public void dropStudent(String student) { 
        students.remove(student);
    }

}