package packageFolder;
import emailAdminApp.SchoolMS;

public class StudentMS{
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

/*
-Fees for every student is 30,000
-Fees paid initially is 0
*/

	public StudentMS(int id, String name, int grade){
		this.feesPaid=0;
		this.feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
	}

	//not going to alter student's name and id

	public void setGrade(int grade){
		this.grade=grade;
	}

	public void payFees(int fees){
		feesPaid+=fees;
		SchoolMS.updateTotalMoneyEarned(fees);
	}

	public String getName(){
		return name;
	}

	public int getGrade(){
		return grade;
	}

	public int getFeesPaid(){
		return  feesPaid;
	}

	public int getFeesTotal(){
		return feesTotal;
	}

	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}
	
}