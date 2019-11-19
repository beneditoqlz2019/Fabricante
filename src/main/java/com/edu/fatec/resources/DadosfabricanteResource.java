package com.edu.fatec.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.fatec.domain.Dadosfabricante;

@RestController
@RequestMapping(value="/dadosfabricante")
public class DadosfabricanteResource {
	@RequestMapping(method=RequestMethod.GET)
public List<Dadosfabricante> listar () {
	Dadosfabricante fab = new Dadosfabricante(1,"ford", null);
	List<Dadosfabricante> lista = new ArrayList<>();
	lista.add (fab);	
	return lista;
}
}
