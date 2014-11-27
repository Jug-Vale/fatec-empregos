/**
 * 
 */
package org.jugvale.fatec.emprego.model.entities.contato;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.jugvale.fatec.emprego.model.entities.EntidadeAbstrata;

/**
 * @author Pedro Hos
 *
 */

@Entity
@SuppressWarnings("serial")
public class Estado extends EntidadeAbstrata {

	@NotNull(message = "{estado.nome.nulo}")
	@Column(nullable = false, unique = true)
	private String nome;
	
	private Pais pais;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	
}
