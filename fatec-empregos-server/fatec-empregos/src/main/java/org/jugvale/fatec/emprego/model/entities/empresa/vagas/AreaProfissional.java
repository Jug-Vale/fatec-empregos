/**
 * 
 */
package org.jugvale.fatec.emprego.model.entities.empresa.vagas;

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
public class AreaProfissional extends EntidadeAbstrata {

	@Column(nullable = false)
	@NotNull(message = "{tipo.nulo}")
	private String tipo;
	
	@Column
	private String descricao;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
