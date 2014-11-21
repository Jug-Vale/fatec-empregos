package org.jugvale.fatec.emprego.model.entities.impl;

import org.jugvale.fatec.emprego.model.entities.AbstractEntity;


public class Teste extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
