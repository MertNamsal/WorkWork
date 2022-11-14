package Bank;

import java.util.Scanner;

public class Credit {
	private int creditAmount; 
	private int creditScore=0;
	static Scanner scan = new Scanner(System.in);
	
	
	public void creditScoreCalculator(Users user, Account account ) {
		if(user.getSalary()<10000) {
			this.creditScore++;
		}else if(user.getSalary()<30000) {
			this.creditScore += 2;
		}else {
			this.creditScore += 3;
		}
		if(account.getMoney()<100000) {
			this.creditScore++;
		}else if(account.getMoney()<500000) {
			this.creditScore += 2;
		}else {
			this.creditScore += 3;
		}
		if(account.getCreditCardLimit()*0.2>(account.getDebt()) && account.getDebt() != 0) {         //under 200
			this.creditScore +=2;
		}else if(account.getCreditCardLimit()*0.7>(account.getDebt()) && account.getDebt() != 0) {     // 200-700
			this.creditScore +=1;
		}else if(account.getDebt()==0){      //when debt is 0
			this.creditScore +=3;
		}else {
			System.out.println("Pay your debt pleaseeee...");    //when debt is more than %70 of creditcardlimit
		}
	
		
	}
	public void getCredit(Account account,Users user) {
		System.out.println("How much credit do you want to get ?");
		int offer = scan.nextInt();
		if(user.getEducationStatus()!=4) {
			if(this.creditScore<6) {
				offer /= 2;
				System.out.println("Do you accept the offer ?(Y/N) "+offer);
				String answer = scan.nextLine();
				if(answer.toLowerCase().trim().charAt(0)=='y') {
					this.creditAmount = offer;
				}else {
					System.out.println("You can't get credit above this offer.");
				}
			}else {
				this.creditAmount=offer;
				System.out.println(offer+" credit has been approved");
			}
		}
	}

	public int getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(int creditAmount) {
		this.creditAmount = creditAmount;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
	
	
	

}
