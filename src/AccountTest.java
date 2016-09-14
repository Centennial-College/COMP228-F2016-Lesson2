import java.util.Scanner;

/**
 * This is the driver class for the Account class
 * 
 * @author kevinma
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Account myAccount = new Account();
		
		System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		
		// Ask user for input
		System.out.println("Please enter the name: ");
		myAccount.setName(input.nextLine());
		System.out.println();
		
		System.out.printf("Name in object myAccount is: %s%n%n", myAccount.getName());

	}

}
