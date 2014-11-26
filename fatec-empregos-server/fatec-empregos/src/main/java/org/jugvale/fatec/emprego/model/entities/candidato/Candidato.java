package org.jugvale.fatec.emprego.model.entities.candidato;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.jugvale.fatec.emprego.model.entities.Usuario;
import org.jugvale.fatec.emprego.model.entities.annotations.Linkedin;

/**
 * @author Pedro Hos
 *
 */

@Entity
@SuppressWarnings("serial")
public class Candidato extends Usuario {
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	@NotNull(message = "{candidato.sexo.nulo}")
	private SEXO sexo;
	
	@Column(name = "data_nascimento", nullable = false)
	@Past(message = "{candidato.dataNascimento.passado}")
	@NotNull(message = "{candidato.dataNascimento.nulo}")
	private LocalDate dataNascimento;
	
	@Column(name = "estado_civil", nullable = false)
	@Enumerated(EnumType.STRING)
	@NotNull(message = "{candidato.estadoCivil.nulo}")
	private EstadoCivil estadoCivil;
	
	@Column(name = "pagina_pessoal")
	private String paginaPessoal;
	
	@Column(unique = true)
	@Linkedin
	private String linkedin;

	public SEXO getSexo() {
		return sexo;
	}

	public void setSexo(SEXO sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getPaginaPessoal() {
		return paginaPessoal;
	}

	public void setPaginaPessoal(String paginaPessoal) {
		this.paginaPessoal = paginaPessoal;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	

}
