
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private String companySuffix = "XYZcompany.com";
	
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;

	
	// Constructor to receive the firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		// Call a method asking for department - return the department
		this.department = setDepartment();
		// Call a method that returns a random password
		this.password = generatePassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		// Combine elements to generate email
		this.alternateEmail = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
	// Ask for department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
		Scanner sc = new Scanner(System.in);
		
		int depChoice = sc.nextInt();
		
		if(depChoice == 1) { return "Sales"; }
		else if(depChoice == 2) { return "Dev"; }
		else if(depChoice == 3) { return "Accounting"; }
		else { return ""; }
	}
	
	// Generate a random password
	private String generatePassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#%^&*()_+";
		char[] randomPassword = new char[length];	
		for(int i = 0; i < length; i++) {
			int randId = (int) (Math.random() * passwordSet.length());
			randomPassword[i] = passwordSet.charAt(randId);
		}
		return new String(randomPassword);	
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) { this.mailboxCapacity = capacity; }
	// Set the alternateEmail
	public void setAlternateEmail(String altEmail) { this.alternateEmail = altEmail; }
	// Change the password
	public void changePassword(String password) { this.password = password; }
	
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
	public String showInfo() {return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
								"COMPANY EMAIL: " + alternateEmail + "\n" +  
								"MAILBOX CAPACITY: " + mailboxCapacity;
	}
}
