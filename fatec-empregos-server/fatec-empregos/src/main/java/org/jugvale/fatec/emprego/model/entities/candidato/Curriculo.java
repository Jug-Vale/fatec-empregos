/**
 * 
 */
package org.jugvale.fatec.emprego.model.entities.candidato;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.jugvale.fatec.emprego.model.entities.EntidadeAbstrata;

/**
 * @author Pedro Hos
 *
 */

@Entity
@SuppressWarnings("serial")
public class Curriculo extends EntidadeAbstrata {

	@Column
	private LocalDate atualizado = LocalDate.now();
	
	@Column
	private String informacoesAdicionais;
	
	@Column
	private String objetivos;
	
	public String getInformacoesAdicionais() {
		return informacoesAdicionais;
	}

	public void setInformacoesAdicionais(String informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}

	public String getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(String objetivos) {
		this.objetivos = objetivos;
	}

	public LocalDate getAtualizado() {
		return atualizado;
	}

}
