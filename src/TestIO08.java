import java.io.*;
public class TestIO08 {
	public static void main(String[] args) throws Exception{
		EmployeeIO08 e1 = new EmployeeIO08("9179", "SUGNANA", "TRAINING", "TRAINER", "mypassword", 40);
		e1.display();
		FileOutputStream fos = new FileOutputStream("d://javawork/ObjectFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);		//Serializing Object
		
		oos.close();
		fos.close();
		System.out.println("Employee Object Serialized to file d://javawork/ObjectFile.txt");
	}
}
class EmployeeIO08 implements Serializable {
	String empId;
	String empName;
	String dept;
	String desg;
	transient String password;
	transient int age;
	public EmployeeIO08(String empId, String empName, String dept, String desg, String password, int age) {
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.desg = desg;
		this.age = age;
		this.password = password;
	}
	void display(){
		System.out.println("ID   : " + empId);
		System.out.println("NAME : " + empName);
		System.out.println("DEPT : " + dept);
		System.out.println("DESG : " + desg);
		System.out.println("AGE  : " + age);
		System.out.println("PASS : " + password);
		
		System.out.println("-----------------------------");
	}
}
