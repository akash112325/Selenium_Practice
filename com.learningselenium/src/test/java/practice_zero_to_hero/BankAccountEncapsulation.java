package practice_zero_to_hero;

public class BankAccountEncapsulation {
	private String accHolderName;
	private int accNo;
	private int balance;
	private String pwd;
	public BankAccountEncapsulation(String accHolderName, int accNo,int balance,String pwd) {
		this.accHolderName = accHolderName;
		this.accNo = accNo;
		this.balance= balance;
		this.pwd =pwd;
	}
	
	public String getAccountHolderName() {
		return accHolderName;
	}
	
	
	public static void main(String[] args) {
		
	}

}
