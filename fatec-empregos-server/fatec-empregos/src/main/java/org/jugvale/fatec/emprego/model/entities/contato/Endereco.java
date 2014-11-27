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
public class Endereco extends EntidadeAbstrata {

	@NotNull(message = "{endereco.endereco.nulo}")
	@Column(nullable = false)
	private String endereco;

	@NotNull(message = "{endereco.numero.nulo}")
	@Column(nullable = false)
	private Integer numero;

	@NotNull(message = "{endereco.Bairro.nulo}")
	@Column(nullable = false)
	private String bairro;

	@Column
	private String CEP;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

}
