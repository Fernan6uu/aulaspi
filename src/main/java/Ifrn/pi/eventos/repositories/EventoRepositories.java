package Ifrn.pi.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Ifrn.pi.eventos.models.Evento;

public interface EventoRepositories extends JpaRepository<Evento, Long>  {

	
	
}
