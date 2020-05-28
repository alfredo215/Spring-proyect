package com.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class Controlador {
	
	@GetMapping("/")
	public String Inicio(Model modelo){
		String mensaje = "hola desde el controlador";
		modelo.addAttribute("saludo", mensaje);
		
		return "index.html";
	}

}
