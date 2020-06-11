package com.Spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Spring.model.Persona;

//@RestController
@Controller
public class Controlador {
	
	@GetMapping("/")
	public String Inicio(Model modelo){
		
		Persona person = new Persona();
		person.setNombre("Alfredo");
		person.setApellido("Moran");
		person.setTelefono("75853-328");
		person.setEmail("calfredomoran@gmail.com");
		
		Persona person2 = new Persona();
		person2.setNombre("Pedro");
		person2.setApellido("Perez");
		person2.setTelefono("75853-328");
		person2.setEmail("peperez1985@gmail.com");
		
		List personas = Arrays.asList(person,person2);
		
		String mensaje = "hola desde el controlador";
		modelo.addAttribute("saludo", mensaje);
		//modelo.addAttribute("persona",person);
		modelo.addAttribute("personas",personas);
		
		return "index";
	}

}
