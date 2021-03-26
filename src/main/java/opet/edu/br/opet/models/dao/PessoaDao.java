package opet.edu.br.opet.models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import opet.edu.br.opetApp.models.Pessoa;

public class PessoaDao {

	public int validar(Pessoa pes){
		
		int i=0;

		try{
			Connection conn = Conexao.getConexao();
			
			PreparedStatement stmt = conn. prepareStatement("SELECT * FROM PES WHERE IDPESSOA = ? AND SENHAPESSOA = ?");

			stmt.setString(1, pes.getId());
			stmt.setString(2, pes.getSenha());

			ResultSet rs = stmt.executeQuery();

			while(rs.next()){
				i=i+1;
				pes.setId(rs.getString("IDPESSOA"));
				pes.setSenha(rs.getString("SENHAPESSOA"));
			}
			if(i==1) {
				return 1;
			}else{
				return 0;
			}	
		}catch (Exception e) {
			return 0;
		}
	}
}
