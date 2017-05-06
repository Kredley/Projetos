package br.com.kredley.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcessoBanco {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		String sql = "select codigo, nome, sexo, email from pessoa";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try{
			//	Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(url, "xti", "xti123");
			PreparedStatement stm = con.prepareStatement(sql);
			
			ResultSet  rs = stm.executeQuery();
			
			while(rs.next()){// pode ser pela posiçao  rs.getString(1) começa com 1
				System.out.println(rs.getString("codigo")
						+ "; " + rs.getString("nome")
						+ "; " + rs.getString("sexo")
						+ "; " + rs.getString("email")
						);
			}
			
			rs.close();
			stm.close();
			con.close();

			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}

}
