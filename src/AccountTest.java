import java.util.Scanner;

/**
 * This is the driver class for the Account class and BankAccount class
 * 
 * @author kevinma
 * @date Wednesday, September 14, 2016
 *
 */
public class AccountTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Account acc1 = new Account("Kevin");
		Account acc2 = new Account("Ostap");
		BankAccount bankAcc1 = new BankAccount("Wallace", 500);
		BankAccount bankAcc2 = new BankAccount("Bob", 0.01);

		//////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.printf("Account1 name is %s%n", acc1.getName());
		System.out.printf("Account2 name is %s%n", acc2.getName());

		System.out.println();

		System.out.printf("%s's balance is: $%.2f%n", bankAcc1.getName(), bankAcc1.getBalance());
		System.out.printf("%s's balance is: $%.2f%n", bankAcc2.getName(), bankAcc2.getBalance());

		//////////////////////////////////////////////////////////////////////////////////////////

		System.out.print("Enter a deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nAdding $%.2f to account1 balance%n%n", depositAmount);
		bankAcc1.deposit(depositAmount);
		System.out.printf("%s's balance is: $%.2f%n", bankAcc1.getName(), bankAcc1.getBalance());
		System.out.printf("%s's balance is: $%.2f%n", bankAcc2.getName(), bankAcc2.getBalance());

		//////////////////////////////////////////////////////////////////////////////////////////

		System.out.print("Enter a deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nAdding $%.2f to account1 balance%n%n", depositAmount);
		bankAcc2.deposit(depositAmount);
		System.out.printf("%s's balance is: $%.2f%n", bankAcc1.getName(), bankAcc1.getBalance());
		System.out.printf("%s's balance is: $%.2f%n", bankAcc2.getName(), bankAcc2.getBalance());

		input.close();
	}

}
