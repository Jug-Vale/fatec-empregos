package org.jugvale.fatec.emprego.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jugvale.fatec.emprego.model.entities.EntidadeAbstrata;
import org.jugvale.fatec.emprego.model.entities.annotations.Email;

/**
 * @author Pedro Hos
 *
 */

@Entity
@SuppressWarnings("serial")
public class Usuario extends EntidadeAbstrata {

	@NotNull(message = "{usuario.nome.nulo}")
	@Size(max = 45, min = 1, message = "{usuario.nome.tamanho}")
	@Column(nullable = false, length = 45)
	private String nome;

	@Email
	@NotNull(message = "{usuario.email.nulo}")
	@Size(max = 45, min = 5, message = "{usuario.email.tamanho}")
	@Column(nullable = false, unique = true, length = 45)
	private String email;

	@NotNull(message = "{usuario.login.nulo}")
	@Size(max = 45, min = 1, message = "{usuario.login.tamanho}")
	@Column(nullable = false, unique = true, length = 45)
	private String login;

	@NotNull(message = "{usuario.senha.nulo}")
	@Size(max = 45, min = 1, message = "{usuario.senha.tamanho}")
	@Column(nullable = false, length = 45)
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
