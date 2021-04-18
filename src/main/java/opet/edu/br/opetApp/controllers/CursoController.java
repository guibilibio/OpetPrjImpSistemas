package opet.edu.br.opetApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import opet.edu.br.opet.models.Interfaces.CursoDao;
import opet.edu.br.opetApp.models.Curso;

@Controller
public class CursoController {

	@Autowired
	private CursoDao cursoDao;

	@RequestMapping("/cadastro")
	public ModelAndView getCurso() {
		
		ModelAndView mv = new ModelAndView("cadastro");
		Iterable<Curso> curso = cursoDao.findAll();
		mv.addObject("curso", curso);
		return mv;
	}
}
