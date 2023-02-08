package accountPackage;


import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CRUD {
	public boolean Register(Pojo user) {
		boolean state = true;
		String sql="insert into account values(?,?,?,?)"; 
		  try (Connection connection=MyConnection.connect()){	  


			  PreparedStatement pstatemnt = connection.prepareStatement(sql);
				
				pstatemnt.setLong(1, user.getAccountNumber());
				pstatemnt.setInt(2, user.getCustomerID());
				pstatemnt.setString(3, user.getAccounttype());
				pstatemnt.setDouble(4, user.getBalance());
				int no = pstatemnt.executeUpdate();
				
				if(no>0) {
					state = true;
				}
		} 
		  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return state;
	}

	public boolean updateAccount(int cust_id, double updateAccountNumber) {
		boolean state = true;
		String sql="update account set account_number= ? where customer_id = ?"; // hardcoded query
		  try (Connection connection=MyConnection.connect()){	  


			  PreparedStatement pstatemnt = connection.prepareStatement(sql);
				
				pstatemnt.setDouble(1, updateAccountNumber);
				pstatemnt.setInt(2, cust_id);
				int no = pstatemnt.executeUpdate();
				
				if(no>0) {
					state = true;
				}
		} 
		  catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return state;
	}

	public boolean updateTheType(int cust_id, String updatedAccountType) {
		boolean state = true;
		String sql="update account set type= ? where customer_id = ?";
		  try (Connection connection=MyConnection.connect()){	  


			  PreparedStatement pstatemnt = connection.prepareStatement(sql);
				
				pstatemnt.setString(1, updatedAccountType);
				pstatemnt.setInt(2, cust_id);
				int no = pstatemnt.executeUpdate();
				
				if(no>0) {
					state = true;
				}
		} 
		  catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return state;
	}

	public boolean updateTheBalance(int cust_id3, double updatedAmount) {
		boolean state = true;
		String sql="update account set balance= ? where customer_id = ?";
		  try (Connection connection=MyConnection.connect()){	  


			  PreparedStatement pstatemnt = connection.prepareStatement(sql);
				
				pstatemnt.setDouble(1, updatedAmount);
				pstatemnt.setInt(2, cust_id3);
				int no = pstatemnt.executeUpdate();
				
				if(no>0) {
					state = true;
				}
		} 
		  catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return state;
	}

	public boolean deleteTheAccount(int cust_id) {
		boolean state = true;
		String sql="delete from account where customer_id =?";
		  try (Connection connection=MyConnection.connect()){	  


			  PreparedStatement pstatemnt = connection.prepareStatement(sql);
				
				pstatemnt.setInt(1, cust_id);
				int no = pstatemnt.executeUpdate();
				
				if(no<0) {
					state = true;
				}
		} 
		  catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return state;
	}

	public boolean searchTheAccount(int cust_id) {
		boolean state = true;
		String sql="select * from account where customer_id =?";
		  try (Connection connection=MyConnection.connect()){	  


			  PreparedStatement pstatemnt = connection.prepareStatement(sql);
				
				pstatemnt.setInt(1, cust_id);
				ResultSet rs = pstatemnt.executeQuery();
//				System.out.println("Out of while loop");
				
				while(rs.next()) {
					Long acntNumber = rs.getLong(1);
					int custId = rs.getInt(2);
					String rsulttype = rs.getString(3);
					double resultBalance = rs.getDouble(4);
					
					Pojo poj = new Pojo(acntNumber,custId,rsulttype,resultBalance);
					System.out.println(poj);
					
				}
		} 
		  catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return state;
	}

	public void searchAll() {
		boolean state = true;
		String sql="select * from account";
		  try (Connection connection=MyConnection.connect()){	  


			  PreparedStatement pstatemnt = connection.prepareStatement(sql);
				
				ResultSet rs = pstatemnt.executeQuery();
//				System.out.println("Out of while loop");
				
				while(rs.next()) {
					Long acntNumber = rs.getLong(1);
					int custId = rs.getInt(2);
					String rsulttype = rs.getString(3);
					double resultBalance = rs.getDouble(4);
					
					Pojo poj = new Pojo(acntNumber,custId,rsulttype,resultBalance);
					System.out.println(poj);
					
					
				}
		} 
		  catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	
}