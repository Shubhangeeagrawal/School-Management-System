package emailAdminApp;
import packageFolder.TeacherMS;
import packageFolder.StudentMS;
import java.util.List;
import java.util.ArrayList;

public class SchoolMS{

    private List<TeacherMS> teachers;
    private List<StudentMS> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public SchoolMS(List<TeacherMS> teachers, List<StudentMS> students){
        this.teachers = teachers;
        this.students = students;    
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<TeacherMS> getTeachers(){
        return teachers;
    }

    public void addTeacher(TeacherMS teacher){
        teachers.add(teacher);
    }

    public void addStudent(StudentMS student){
        students.add(student);
    }

    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int moneyEarned){
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent){
        totalMoneySpent -= moneySpent;
    }
    public int getTotalMoneyLeft(){
	return totalMoneyEarned - totalMoneySpent;
    }

}
