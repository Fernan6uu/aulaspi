package Ifrn.pi.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Ifrn.pi.eventos.models.Evento;
import Ifrn.pi.eventos.repositories.EventoRepositories;

@Controller
public class EventoController {
	@Autowired
	private EventoRepositories er;
	@RequestMapping("/eventos/form")
	public String form() {
		return"formEvento";
	}
	
	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		er.save(evento);
		
		return "evento-adicionado";
		
	}

}
