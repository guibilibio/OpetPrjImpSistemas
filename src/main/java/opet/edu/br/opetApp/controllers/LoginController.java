package opet.edu.br.opetApp.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import opet.edu.br.opet.models.Interfaces.PessoaDao;
import opet.edu.br.opetApp.models.Pessoa;

@Controller
public class LoginController {
	
	@Autowired
	private PessoaDao pessoaDao;
	@GetMapping("/")
	public String exibirIndex(Pessoa pessoa) {
		return "index";
	}
	
	@PostMapping("/home")
	public String efetuarLogin(Pessoa pessoa, HttpSession session,
			RedirectAttributes ra) {
		
		pessoa = this.pessoaDao.findByLoginAndSenha(pessoa.getLogin(), pessoa.getSenha());
		if(pessoa != null) {
			session.setAttribute("usuarioLogado", pessoa);
			return "redirect:/home";
		}else {
			ra.addFlashAttribute("mensagem","Usuário ou senha inválidos.");
			return "redirect:/";
		}
	}
	
	
}
