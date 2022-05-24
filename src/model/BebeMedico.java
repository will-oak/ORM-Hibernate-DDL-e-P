package model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe_medico")
public class BebeMedico {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "cpf_cliente")
	@NotNull
	private Medico medico;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "id_atendente")
	@NotNull
	private Bebe bebe;
	
	@Id
	@Column(name="data_hora_atendimento")
	@NotNull
	private LocalDateTime dataHora;
	

}
