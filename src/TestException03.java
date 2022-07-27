public class TestException03 {
	public static void main(String[] args) {
		System.out.println("START of Application");
		BankApplication bank = new BankApplication(10000);
		try {
			bank.withDraw(5000);
			bank.deposit(2000);
			bank.withDraw(15000);
		} catch (InsufficentBalanceException e) {
			e.printStackTrace();
		} 
		System.out.println("END   of Application");
	}
}
class BankApplication {
	double balance;
	public BankApplication(double balance) {
		this.balance = balance;
	}
	void withDraw(double withDrawAmount) throws InsufficentBalanceException{
		if(balance < withDrawAmount) {
			throw new InsufficentBalanceException("Balance : " + balance + " is less then With Draw Amount : " + withDrawAmount);
		}
		balance = balance - withDrawAmount;
	}
	void deposit(double depositAmount) {
		balance = balance + depositAmount;
	}
}
class InsufficentBalanceException extends Throwable{
	public InsufficentBalanceException(String s) {
		super(s);
	}
}
