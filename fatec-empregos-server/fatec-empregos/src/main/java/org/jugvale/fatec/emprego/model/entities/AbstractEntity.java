package org.jugvale.fatec.emprego.model.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Pedro Hos
 */
@MappedSuperclass
public class AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false, nullable = false)
	protected Long id = null;

	@Column(nullable = false)
	private Boolean ativo;
	
	@Column(name = "data_criado", nullable = false)
	private LocalDateTime dataCriado = LocalDateTime.now();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public LocalDateTime getDataCriado() {
		return dataCriado;
	}

	public void setDataCriado(LocalDateTime dataCriado) {
		this.dataCriado = dataCriado;
	}
}
