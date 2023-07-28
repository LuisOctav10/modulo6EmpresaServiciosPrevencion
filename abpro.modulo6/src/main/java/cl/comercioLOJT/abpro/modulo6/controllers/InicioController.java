package cl.comercioLOJT.abpro.modulo6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class InicioController {
	
	@RequestMapping(path="/inicio", method = RequestMethod.GET)
	public ModelAndView mostrarInicio() {
		return new ModelAndView("inicio", "mensaje",
				"ABPRO3 Módulo 6. Ejemplo de desarrollo de aplicación utilizando framework Spring");
	}

}
