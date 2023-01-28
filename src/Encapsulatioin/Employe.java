package Encapsulatioin;

public class Employe {
	private int emp_id;
	
	public void setEmp_Id(int id) {  //setter method
		emp_id=id;
		
	}
	public void getEmp_Id() {    //getter method
		System.out.println(emp_id);
	}

	public static void main(String[] args) {
		Employe e=new Employe();
		e.setEmp_Id(101);
		e.getEmp_Id();
		

	}

}
