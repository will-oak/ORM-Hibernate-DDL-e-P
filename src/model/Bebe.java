package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe")
public class Bebe  {
	
	@Column(name = "hora_entrada")
	@NotNull
	private int horaEntrada;

	@Column(name = "data_nascimento")
	@NotNull
	private LocalDate dataNascimento;

	@Column(name = "altura" )
	@NotNull
	private float altura;

	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Bebe [horaEntrada=" + horaEntrada + ", dataNascimento=" + dataNascimento + ", altura=" + altura + "]";
	}
	
    

}
