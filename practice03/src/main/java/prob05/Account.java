package prob05;

public class Account {

	private String accountNo;
	private int balance = 0;

	public Account(String string) {
		accountNo = string;
		System.out.println(accountNo + "계좌가 개설되었습니다.");
		// TODO Auto-generated constructor stub
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void save(int save) {
		System.out.println(accountNo + "계좌에 " + save + "만원이 입금되었습니다.");
		balance += save;
		// TODO Auto-generated method stub

	}

	public void deposit(int deposit) {
		System.out.println(accountNo + "계좌에 " + deposit + "만원이 출금되었습니다.");
		balance += deposit;
		// TODO Auto-generated method stub

	}

}
