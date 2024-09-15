import packageFolder.TeacherMS;
import packageFolder.StudentMS;
import java.util.List;
import java.util.ArrayList;

public class SchoolMSystem {
    public static void main(String[] args) {
        
        TeacherMS lizzy = new TeacherMS(1, "Lizzy", 500);
        TeacherMS mellisa = new TeacherMS(2, "Melliza", 700);
        TeacherMS vanderhorn = new TeacherMS(3, "Vanderhorn", 600);

        List<TeacherMS> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        StudentMS tamasha = new StudentMS(1, "Tamasha", 4);
        StudentMS rakshita = new StudentMS(2, "Rakshita", 12);
        StudentMS rabbi = new StudentMS(3, "Rabbi", 5);

        List<StudentMS> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshita);

        SchoolMS ghs = new SchoolMS(teacherList, studentList);

        System.out.println("+++++ GHS Recap Fees +++++");
        System.out.println("Students :");
        
        tamasha.payFees(10000);
        System.out.println(tamasha.getName() + " Remaining fees : $" + tamasha.getRemainingFees());
        
        rakshita.payFees(6000);
        System.out.println(rakshita.getName() + " Remaining fees : $" + rakshita.getRemainingFees());
        
        rabbi.payFees(7000);
        System.out.println(rabbi.getName() + " Remaining fees : $" + rabbi.getRemainingFees());

        System.out.println();
        System.out.println("Teachers :");
        
       
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println(lizzy.getName() + " Earned Salary : " + lizzy.getSalary());
        
        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println(mellisa.getName() + " Earned Salary : " + mellisa.getSalary());
        
        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println(vanderhorn.getName() + " Earned Salary : " + vanderhorn.getSalary());

        System.out.println();
        System.out.println("School : ");
        System.out.println("GHS Earned Money : $" + ghs.getTotalMoneyEarned());
        System.out.println("GHS Spent Money : $" + ghs.getTotalMoneySpent());

        
        int remainingMoney = ghs.getTotalMoneyEarned() - ghs.getTotalMoneySpent();
        System.out.println("GHS Money Left : $" + remainingMoney);
        System.out.println("++++++++++++++++++++++++++");
    }
}
