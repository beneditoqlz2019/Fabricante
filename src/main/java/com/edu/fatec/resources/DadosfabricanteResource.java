package com.edu.fatec.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/dadosfabricante")
public class DadosfabricanteResource {
	@RequestMapping(method=RequestMethod.GET)
public String listar () {
	return "Fabricante esta funcionando";
}
}
