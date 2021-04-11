package opet.edu.br.opet.models.Interfaces;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import opet.edu.br.opetApp.models.Pessoa;

@Repository
@Transactional
public interface PessoaDao extends JpaRepository<Pessoa, Integer> {
	
	public Pessoa findByLoginAndSenha (String login, String senha); 
	
}
