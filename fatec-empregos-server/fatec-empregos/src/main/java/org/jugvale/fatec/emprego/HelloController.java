package org.jugvale.fatec.emprego;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

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
        result.include("mensagem", "Olá, VRaptor 4!");
    }
}
