package org.jugvale.fatec.emprego.controller;

import javax.inject.Inject;

import org.jugvale.fatec.emprego.model.entities.impl.Teste;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Controller
public class HelloController {

	private Result result;

	/**
	 * @deprecated
	 * Apenas para alegria do CDI
	 */
	public HelloController() {}
	
	@Inject
	public HelloController(Result result) {
		this.result = result;
	}
	
	@Get("/home")
    public void home() {
		Teste teste = new Teste();
		teste.setId(1l);
		teste.setNome("Teste JSON");
		
		result.use(Results.json()).from(teste).serialize();
    }
}
