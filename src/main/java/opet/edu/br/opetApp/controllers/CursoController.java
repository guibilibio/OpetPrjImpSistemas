package opet.edu.br.opetApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import opet.edu.br.opet.models.Interfaces.CursoDao;
import opet.edu.br.opetApp.models.Curso;

@Controller
public class CursoController {

	@Autowired
	CursoDao cursoDao;

	@RequestMapping("/cadastro")
	public ModelAndView listaCursos() {
		ModelAndView mv = new ModelAndView("cadastro");
		Iterable<Curso> curso = cursoDao.findAll();
		mv.addObject("cursos", curso);
		return mv;
	}

}
