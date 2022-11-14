package Bank;

import java.util.Random;

public class Account {
	
	private int money;
	private int accountNo;
	private long cardId;
	private int memberNo;
	private int password;
	private int debt;
	private boolean isCreditCard;
	private double creditCardLimit;
	
	
	public Account(int money,boolean isCreditCard) {
		this.money = money;
		this.isCreditCard = isCreditCard;
		
		Random random = new Random();
		int random1 = random.nextInt(100000000);
		this.accountNo=random1;
		
		Random random01 = new Random();
		int random2 = random.nextInt(1000,9999);
		this.password=random2;
	}
	

	public int getDebt() {
		return debt;
	}
	public boolean isCreditCard() {
		return isCreditCard;
	}

	public void setCreditCard(boolean isCreditCard) {
		this.isCreditCard = isCreditCard;
	}

	public void setDebt(int debt) {
		this.debt = debt;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public long getCardId() {
		return cardId;
	}
	public void setCardId(long cardId) {
		this.cardId = cardId;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}


	public double getCreditCardLimit() {
		return creditCardLimit;
	}


	public void setCreditCardLimit(double creditCardLimit) {
		this.creditCardLimit = creditCardLimit;
	}
	
	

}
