package Bank;

public class Main {
	
	public static void main(String[] args) {
		Account account = new Account(100000,false);
		Users user = new Users("Ahmet","Şen",1236584,1950,20000);
		Credit credit = new Credit();
		AccountManager accountManager = new AccountManager();
		
//		credit.creditScoreCalculator(user, account);
//		credit.getCredit(account, user);
//		
		accountManager.passwordChange(account);
		accountManager.creditCardLimitCalculator(account, user);
		
		accountManager.deposit(account, 5000);
		
		
	}
	
	

}
