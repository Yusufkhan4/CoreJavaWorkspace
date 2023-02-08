package accountPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;



public class AccountDemo {
	
	public static void main(String... args) throws IOException, ClassNotFoundException, SQLException {
		
//	Connection con = MyConnection.connect();
//	if(con!=null) {
//		System.out.println("Succesfully connected");
//	}else {
//		System.out.println("Fail");
//	}

	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	CRUD crud = new CRUD();
	Pojo pojo = new Pojo();
	TransactionDemo tCrud = new TransactionDemo();
	
	
	
	int ch=0;
	
	do {
		System.out.println("Choose one of the follwing option:");
		System.out.println("1: Insert an Account  \n2: Update your account \n3: Delete the account \n4: Search an account \n5: Show all accounts \n6: Make transaction \n7: Exit");
		ch=sc.nextInt();
		switch (ch) {
		
		case 1: 
		System.out.println("Enter your account number:");
		long accountNo = sc.nextLong();
		System.out.println("Enter your customer ID:");
		int custID = sc.nextInt();
		System.out.println("Enter type of account. for e.g.: Savings, Current etc.");
		String accountType = br.readLine();
		System.out.println("Enter the balance of your account");
		double amount = sc.nextDouble();
		
		pojo.setAccountNumber(accountNo);
		pojo.setCustomerID(custID);;
		pojo.setAccounttype(accountType);
		pojo.setBalance(amount);
		
		if(crud.Register(pojo)) {
			System.out.println("Data entered sucessfully");
		}else {
			System.out.println("Data entered unsucessfully");
		}
		break;
		
		
		case 2:
			int updateCh = 0;
			do {
				System.out.println("Select the option to update the information");
				System.out.println("1: Account Number  \n2: Account Type \n3: Balance \n4: Exit");
				updateCh = sc.nextInt();
				switch(updateCh) {
				case 1:
					System.out.println("To update the account number provide your cutomer Id");
					System.out.println("Enter your customerId:");
					int cust_id1 = sc.nextInt();
					System.out.println("Enter your account number:");
					long updateAccountNo = sc.nextInt();
					
					
					if(crud.updateAccount(cust_id1,updateAccountNo)) {
						pojo.setAccountNumber(updateAccountNo);
						System.out.println("Account Number updated sucessfully");
					}else {
						System.out.println("Data entered unsccesfuly");
					}
					break;
					
				case 2:
					System.out.println("To update the account type provide your cutomer Id");
					System.out.println("Enter your customerId:");
					int cust_id2 = sc.nextInt();
					System.out.println("Enter type of account to update. for e.g.: Savings, Current etc.");
					String updatedAccountType = br.readLine();
					
					if(crud.updateTheType(cust_id2,updatedAccountType)) {
						pojo.setAccounttype(updatedAccountType);
						System.out.println("Account Number updated sucessfully");
					}else {
						System.out.println("Data entered unsccesfuly");
					}
					break;
				case 3:
					System.out.println("To update the account type provide your cutomer Id");
					System.out.println("Enter your customerId:");
					int cust_id3 = sc.nextInt();
					System.out.println("Enter the balance of your account");
					double updatedAmount = sc.nextDouble();
					if(crud.updateTheBalance(cust_id3,updatedAmount)) {
						pojo.setBalance(updatedAmount);
						System.out.println("Balance updated sucessfully");
					}else {
						System.out.println("Balance updated unsucessfully");
					}
					break;
				case 4:
					break;
				default:System.out.println("Wrong Choice!!!");
				break;
					
				}
			}while(updateCh!=4);
			break;
		case 3:
			System.out.println("To delete the account provide your cutomer Id");
			System.out.println("Enter your customerId:");
			int cust_id = sc.nextInt();
			if(crud.deleteTheAccount(cust_id)) {
				System.out.println("Account deleted sucessfully");
			}else {
				System.out.println("Account deleted unsucessfully");
			}
			break;
		case 4:
			System.out.println("To Search the account provide your cutomer Id");
			int searchCust_id = sc.nextInt();
			if(crud.searchTheAccount(searchCust_id)) {
				System.out.println("Account detail is present");
			}else {
				System.out.println("No such account present on database related to this customer ID");
			}
			break;
		case 5:
			System.out.println("Record of all the accounts");
			crud.searchAll();
			break;
		case 6:
			
			int cht = 0;
			do {
				
			System.out.println("1: DEPOSIT  \n2: WITHDRAW \n3: MONEY TRANSFER \n4: SHOW BALANCE \n5: EXIT");
			cht = sc.nextInt();
			switch(cht) {
			case 1:
				System.out.println("Enter your accountNumber");
				Long senderAccount1 = sc.nextLong();
				System.out.println("Enter the Deposit amount");
				double depAmount =sc.nextDouble();
				double dbalance = tCrud.deposit(senderAccount1,depAmount);
				System.out.println(depAmount + " is debited from your account. The total balance in your account is "+ dbalance);
	
				break;
			case 2:
				System.out.println("Enter your accountNumber");
				Long senderAccount2 = sc.nextLong();
				System.out.println("Enter the amount to be withdrawn");
				 double withAmount=sc.nextDouble();
				 double wbalance = tCrud.withDrawn(withAmount);
				 System.out.println(withAmount + " is debited to your account. The total balance in your account is "+ wbalance);
		
				
				break;
			case 3:
				System.out.println("Enter your accountNumber");
				Long senderAccount3 = sc.nextLong();
				System.out.println("Enter the receivers account number");
				Long receiverAccount = sc.nextLong();
				System.out.println("Enter the amount to send");
				double transferamount =sc.nextDouble();
				double tbalance = tCrud.MoneyTransfer(transferamount);
				break;
			case 4:
				System.out.println("Enter your accountNumber");
				Long senderAccount4 = sc.nextLong();
				double remainBalance = tCrud.RemainBalance(senderAccount4);
				break;
			case 5:
				break;
			default:System.out.println("Wrong Choice!!!");
				break;
			}
		}while(cht!=5);
		break;
		case 7:
			break;
		default:System.out.println("Wrong Choice!!!");
		break;
	
	}
	}while(ch!=7);
	
	}
}
