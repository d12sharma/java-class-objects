class BankAccount {
	private String accountHolder;
	private long accountNumber;
	private double balance;
	
	public BankAccount (String accountHolder, long accountNumber , double balance){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	public void depositingMoney(int depositingAmount) {
		System.out.println("Money Deposited :"+depositingAmount);
		balance=balance + depositingAmount;
	}
	public void withdrawMoney(int withdrawAmount){
		if(withdrawAmount<=balance){
			System.out.println("Money Withdrawn :"+withdrawAmount);
			balance=balance - withdrawAmount;
		}
		else{
			System.out.println("Insufficient Balance");
		}
	}
		public double currentBalance(){
		   return balance;
		}
		public static void main(String[] args){
		BankAccount account1 = new BankAccount("Dhruv Sharma",508546007,5000);
		account1.depositingMoney(1000);
		System.out.println("Current Balance :"+account1.currentBalance());
		account1.withdrawMoney(2000);
		System.out.println("Current Balance :"+account1.currentBalance());
		}
	
}
/*
Output 
Money Deposited :1000
Current Balance :6000.0
Money Withdrawn :2000
Current Balance :4000.0
*/