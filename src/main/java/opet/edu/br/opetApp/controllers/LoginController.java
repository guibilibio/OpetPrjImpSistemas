package opet.edu.br.opetApp.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import opet.edu.br.opetApp.models.Pessoa;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String exibirIndex(Pessoa pessoa) {
		return "index";
	}
	
	@PostMapping("/efetuarLogin")
	public String efetuarLogin(Pessoa pessoa, 
			HttpSession session, RedirectAttributes ra) {
			
			
		if(pessoa.getId().equals("admin") &&
		   pessoa.getSenha().equals("12345")) {
			session.setAttribute("pessoaLogada", pessoa);
			return "redirect:/home";
		}else {
			ra.addFlashAttribute("mensagem","Senha ou usuário inválido.");
			return "redirect:/";
		}
	}
}
