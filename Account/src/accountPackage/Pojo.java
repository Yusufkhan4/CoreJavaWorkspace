package accountPackage;

public class Pojo {
	
	long accountNumber;
	int customerID;
	String accounttype;
	double balance;
	public Pojo(long accountNumber, int customerID, String accounttype, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerID = customerID;
		this.accounttype = accounttype;
		this.balance = balance;
	}
	public Pojo() {
		// TODO Auto-generated constructor stub
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customerID=" + customerID + ", accounttype=" + accounttype
				+ ", balance=" + balance + "]";
	}
	
	
	

}
