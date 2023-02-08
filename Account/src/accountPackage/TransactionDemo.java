package accountPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionDemo {

	public double deposit(Long senderAccount,double depAmount) {
		Pojo pojo = new Pojo();
//		String sql="select balance from account where account_number=?";
		String sql = "select account_number from account where account_number=?";
		double currentBalance = 0;
		  try (Connection connection=MyConnection.connect()){	  
			  PreparedStatement pstatemnt = connection.prepareStatement(sql);
				pstatemnt.setDouble(1, senderAccount);
//				pstatemnt.setInt(2, cust_id3);
			
				
				ResultSet rs = pstatemnt.executeQuery();
				
				if(rs.next()) {
					Long sqlAccountNo = rs.getLong(1);
					if(sqlAccountNo.equals(senderAccount)) {
						String sql1="select balance from account where account_number=?";
						
							  PreparedStatement pstatemnt1 = connection.prepareStatement(sql);
								pstatemnt.setDouble(1, senderAccount);
								ResultSet rs1 = pstatemnt.executeQuery();
								
								if(rs1.next()) {
									Double balance = rs1.getDouble(1);
									currentBalance = balance + depAmount;
									pojo.setBalance(currentBalance);
								}
					}
					
				}
		} 
		  catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return currentBalance;
	}

	public double withDrawn(double depAmount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double MoneyTransfer(double transferamount) {
		// TODO Auto-generated method stub
		return 0;
	}


	public double RemainBalance(Long senderAccount4) {
		// TODO Auto-generated method stub
		return 0;
	}
}
