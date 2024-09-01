package com.home;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.home.models.Persona;

@Component
public class PersonaRepository {
	private List personas = new ArrayList<Persona>();
	
	public PersonaRepository() {
		personas.add(new Persona("ana"));
	}
	
	public void add(Persona persona) {
		personas.add(persona);
	}
	
	public List<Persona> buscarTodo(){
		return personas;
	}
	
}
