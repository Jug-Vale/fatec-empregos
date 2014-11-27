package org.jugvale.fatec.emprego.model.entities.contato;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jugvale.fatec.emprego.model.entities.EntidadeAbstrata;

/**
 * @author Pedro Hos
 *
 */

@Entity
@SuppressWarnings("serial")
public class Telefone extends EntidadeAbstrata {
	
	@NotNull(message = "{telefone.ddd.nulo}")
	@Size(max = 2, min = 2, message = "{telefone.ddd.tamanho}")
	@Column(nullable = false)
	private String dDD;
	
	@NotNull(message = "{telefone.telefone.nulo}")
	@Column(nullable = false)
	private String telefone;
	
	@Column (nullable = false)
	@Enumerated(EnumType.STRING)
	@NotNull(message = "{telefone.tipo.nulo}")
	private
	TipoTelefone tipo;

	public String getdDD() {
		return dDD;
	}

	public void setdDD(String dDD) {
		this.dDD = dDD;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}
	

}
