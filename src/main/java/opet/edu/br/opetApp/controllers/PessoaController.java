package opet.edu.br.opetApp.controllers;

import java.security.NoSuchAlgorithmException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import opet.edu.br.App.Util.Util;
import opet.edu.br.opet.models.Interfaces.PessoaDao;
import opet.edu.br.opetApp.models.Pessoa;

@Controller
public class PessoaController {

	@Autowired
	private PessoaDao pessoaDao;

	@RequestMapping(value="/cadastro", method=RequestMethod.GET)
	public String exibeForm() {
		return "/cadastro";
	}

	@RequestMapping(value="/salvarpessoa", method=RequestMethod.POST)
	public String salvar(@Valid Pessoa pessoa, BindingResult bindingResult, RedirectAttributes ra) throws NoSuchAlgorithmException{

		try {
			if(bindingResult.hasErrors()) {
				ra.addFlashAttribute("mensagem","Todos os campos são obrigatórios.");
				return "redirect:/cadastro";
			}else {

				if(pessoa.getLogin().contains(" ")) {
					ra.addFlashAttribute("mensagem","O campo login não pode ter espaços em branco.");
					return "redirect:/cadastro";
				}else {
					pessoa.setSenha(Util.md5(pessoa.getSenha()));
					pessoaDao.save(pessoa);
					ra.addFlashAttribute("mensagem","Cadastro realizado com sucesso.");
					return "redirect:/";
				}

			}
		} catch (Exception e) {
			ra.addFlashAttribute("mensagem","Login já existente, favor preencher os dados novamente.");
			return "redirect:/cadastro";
		}
	}
}
