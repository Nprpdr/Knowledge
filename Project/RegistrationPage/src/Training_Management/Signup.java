package Training_Management;

import java.util.Scanner;

public class Signup {
	public String fName;
	public String lName;
	public String mName;
	Scanner scanner  = new Scanner(System.in);
	void AcceptName(){
		System.out.println("Enter the First Name");
		fName = scanner.next();
		mName = scanner.next();
		lName = scanner.next();
	}
	public static void main(String[] args) {
		Signup signup = new Signup();
		signup.AcceptName();
	}
		
}

