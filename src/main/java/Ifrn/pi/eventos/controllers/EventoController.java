package Ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Ifrn.pi.eventos.models.Evento;

@Controller
public class EventoController {
	
	@RequestMapping("/eventos/form")
	public String form() {
		return"formEvento";
	}
	
	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		
		return "evento-adicionado";
		
	}

}
