package Encapsulatioin;

public class This {
	private int emp_id;
	
	public void setEmp_Id(int emp_id) {
		this.emp_id = emp_id;
	}
	public void getEmp_Id() {
		System.out.println(emp_id);
	}

	public static void main(String[] args) {
		This e=new This();
		e.setEmp_Id(200);
		e.getEmp_Id();
		

	}

}
