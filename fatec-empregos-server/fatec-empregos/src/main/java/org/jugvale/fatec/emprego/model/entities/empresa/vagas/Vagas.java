package org.jugvale.fatec.emprego.model.entities.empresa.vagas;

import java.math.BigDecimal;
import java.time.LocalDate;

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
public class Vagas extends EntidadeAbstrata {

	@Column(nullable = false)
	@NotNull(message = "{vagas.titulo.nulo}")
	private String titulo;
	
	@Column(name = "dados_vaga", nullable = false)
	@NotNull(message = "{vagas.dadosVaga.nulo}")
	private String dadosVaga;

	@Column(name = "data_inicio_recebimento_curriculos", nullable = false)
	private LocalDate dataInicioRecebimentoCurriculos;
	
	@Column(name = "data_fim_recebimento_curriculos", nullable = false)
	private LocalDate dataFimRecebimentoCurriculos;
	
	@Column(name = "local_vaga", nullable = false)
	private String localVaga;
	
	@Column(name = "quantidade_vagas", nullable = false)
	private Integer quantidadeVagas;
	
	@Column(name = "informacoes_adicionais", nullable = false)
	private String informcoesAdicionais;
	
	@Column(name = "vaga_pne", nullable = false)
	@NotNull(message = "{vagas.vagaPNE.nulo}")
	private Boolean vagaPNE;
	
	@Column(name = "salario_a_combinar", nullable = false)
	@NotNull(message = "{vagas.salarioACombinar.nulo}")
	private Boolean salarioACombinar;
	
	@Column(nullable = false)
	private BigDecimal salario;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDadosVaga() {
		return dadosVaga;
	}

	public void setDadosVaga(String dadosVaga) {
		this.dadosVaga = dadosVaga;
	}

	public LocalDate getDataInicioRecebimentoCurriculos() {
		return dataInicioRecebimentoCurriculos;
	}

	public void setDataInicioRecebimentoCurriculos(
			LocalDate dataInicioRecebimentoCurriculos) {
		this.dataInicioRecebimentoCurriculos = dataInicioRecebimentoCurriculos;
	}

	public LocalDate getDataFimRecebimentoCurriculos() {
		return dataFimRecebimentoCurriculos;
	}

	public void setDataFimRecebimentoCurriculos(
			LocalDate dataFimRecebimentoCurriculos) {
		this.dataFimRecebimentoCurriculos = dataFimRecebimentoCurriculos;
	}

	public String getLocalVaga() {
		return localVaga;
	}

	public void setLocalVaga(String localVaga) {
		this.localVaga = localVaga;
	}

	public Integer getQuantidadeVagas() {
		return quantidadeVagas;
	}

	public void setQuantidadeVagas(Integer quantidadeVagas) {
		this.quantidadeVagas = quantidadeVagas;
	}

	public String getInformcoesAdicionais() {
		return informcoesAdicionais;
	}

	public void setInformcoesAdicionais(String informcoesAdicionais) {
		this.informcoesAdicionais = informcoesAdicionais;
	}

	public Boolean getVagaPNE() {
		return vagaPNE;
	}

	public void setVagaPNE(Boolean vagaPNE) {
		this.vagaPNE = vagaPNE;
	}

	public Boolean getSalarioACombinar() {
		return salarioACombinar;
	}

	public void setSalarioACombinar(Boolean salarioACombinar) {
		this.salarioACombinar = salarioACombinar;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
}
