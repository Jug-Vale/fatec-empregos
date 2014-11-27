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
public class Cidade extends EntidadeAbstrata {

	@NotNull(message = "{cidade.nome.nulo}")
	@Column(nullable = false, unique = true)
	private String nome;
	
	private Estado estado;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
