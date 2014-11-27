package org.jugvale.fatec.emprego.model.entities.empresa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jugvale.fatec.emprego.model.entities.Usuario;
import org.jugvale.fatec.emprego.model.entities.annotations.Email;

/**
 * @author Pedro Hos
 *
 */

@Entity
@SuppressWarnings("serial")
public class Empresa extends Usuario {

	@Column(name = "nome_responsavel", nullable = false)
	@NotNull(message = "{empresa.nomeResponsavel.nulo}")
	private String nomeResponsavel;
	
	@Column(name = "nome_empresa", unique = true, nullable = false)
	@NotNull(message = "{empresa.nomeEmpresa.nulo}")
	private String nomeEmpresa;
	
	@Column(name = "ramo_atuacao", nullable = false)
	@NotNull(message = "{empresa.ramoAtuacao.nulo}")
	private String ramoAtuacao;
	
	@Column
	private String site;
	
	@Email
	@Column(name = "email_envio_curriculos", unique = true, nullable = false)
	@NotNull(message = "{empresa.emailParaEnvioCurriculo.nulo}")
	private String emailParaEnvioCurriculo;
	
	@Column(length = 1000)
	@Size(max = 1000, min = 0, message = "{empresa.descricao.tamanho}")
	private String descricao;
	
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getRamoAtuacao() {
		return ramoAtuacao;
	}

	public void setRamoAtuacao(String ramoAtuacao) {
		this.ramoAtuacao = ramoAtuacao;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getEmailParaEnvioCurriculo() {
		return emailParaEnvioCurriculo;
	}

	public void setEmailParaEnvioCurriculo(String emailParaEnvioCurriculo) {
		this.emailParaEnvioCurriculo = emailParaEnvioCurriculo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
