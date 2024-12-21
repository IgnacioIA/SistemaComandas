package net.Comanda.SistemaComandas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class PrimerosController {

	@GetMapping("/home")
	public String mostrarHome(Model model) {
		model.addAttribute("mensaje", "Bienvenidos a empleos App");
		return "Principal";
	}
	
	@GetMapping("/empleado")
	public String empeladoPagina(Model model) {
		model.addAttribute("mensaje", "Bienvenidos a empleos App");
		return "empleado";
	}
}
