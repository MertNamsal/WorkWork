package Bank;

import java.util.Scanner;

public class AccountManager {
	static Scanner scan = new Scanner(System.in);
	public void withdraw(Account account, int withdraw) {
		if(withdraw < account.getMoney()) {
			account.setMoney(account.getMoney()-withdraw);
		}else {
			System.out.println("The amount you want to withdraw is insufficient.");
		}
	}
	
	public void creditCardLimitCalculator(Account account,Users user) {
		if(account.isCreditCard()) {
			account.setCreditCardLimit(user.getSalary()*1.5);
		}else {
			System.out.println("Do you want to get a credit card ?(Y/N)");
			scan.nextLine();
			String answer = scan.nextLine().toLowerCase().trim();
			
			if(answer.charAt(0)=='y') {
				System.out.println("Congratulations");
				account.setCreditCardLimit(user.getSalary()*1.5);
			}
	
		}
	}
	
	public void deposit(Account account, int deposit) {
		if(deposit > 10000) {
			System.err.println("The daily limit of the deposit is exceeded");
		} else {
			account.setMoney(account.getMoney()+deposit);
			System.out.println("New balance : "+account.getMoney());
		}
	}
	public void passwordChange(Account account) {
	
		boolean check = true;
		while(check) {
			System.out.println("Enter your new 4 digits password :");
			int newPassword = scan.nextInt();
			if(newPassword>999 && newPassword<10000 ) {
				account.setPassword(newPassword);
				System.out.println("Your password has been successfully changed.");
				check = false;
			}else {
				System.err.println("Password should be 4 digits.");
			}
		}
		
	}
	public void depthStatus(Account account) {
		
	}

}
