package com.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.dtos.PersonaDto;
import com.home.mappers.PersonaMapper;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {
	@Autowired
	private PersonaService servicio;

	public void add(PersonaDto personaDto) {
		servicio.add(PersonaMapper.toBo(personaDto));
	}
	
	@GetMapping
	public List<PersonaDto> buscarTodo() {
		return servicio.buscarTodo().stream()
				.map(PersonaMapper::toDto)
				.toList();
	}



}
