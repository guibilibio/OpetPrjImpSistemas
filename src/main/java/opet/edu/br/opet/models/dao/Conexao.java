package opet.edu.br.opet.models.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public static Connection getConexao() throws Exception{

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","230909");
		return conn;  
 	} 
}
