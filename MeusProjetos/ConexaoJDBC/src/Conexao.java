
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/t2tidb";
			Connection con = DriverManager.getConnection(url, "kredley", "123");			
		    System.out.println("Con: "+con);
		    Statement statement = con.createStatement();
		   // statement.executeUpdate("Insert into clientes (rg, nome) values (5, 'fulano')");
		    
		    ResultSet rs= statement.executeQuery("Select * from clientes");
		    if(rs.first())
		    {
		    	do{
		    		System.out.println("Nome: "+rs.getString("nome"));
		    	}while(rs.next());
		    }
		    
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
