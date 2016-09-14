import java.util.Scanner;

/**
 * This is the driver class for the Account class
 * 
 * @author kevinma
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		Account acc1 = new Account("Kevin");
		Account acc2 = new Account("Ostap");
		
		System.out.printf("Account1 name is %s%n", acc1.getName());
		System.out.printf("Account2 name is %s%n", acc2.getName());
	}

}
