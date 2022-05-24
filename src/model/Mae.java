package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "mae")
@Inheritance(strategy = InheritanceType.JOINED)
public class Mae  {

	@Id
	@Column(name = "id")
	@NotNull
	private int id;

	@Column(name = "nome", length = 100)
	@NotNull
	private String nome;
	
	@Column(name = "data_nascimento")
	@NotNull
	private LocalDate dataNascimento;

	@Column(name = "numero_endereco")
	@NotNull
	private int numEndereco;
	
	@Column(name = "telefone", length = 11)
	@NotNull
	private String telefone;
	
	@Column(name = "complemento_endereco", length = 200)
	@NotNull
	private String compEndereco;
	
	@Column(name = "logradouro_endereco", length = 200)
	@NotNull
	private String lograEndereco;
	
	@Column(name = "CEP_endereco", length = 8)
	@NotNull
	private String cepEndereco;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getNumEndereco() {
		return numEndereco;
	}

	public void setNumEndereco(int numEndereco) {
		this.numEndereco = numEndereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCompEndereco() {
		return compEndereco;
	}

	public void setCompEndereco(String compEndereco) {
		this.compEndereco = compEndereco;
	}

	public String getLograEndereco() {
		return lograEndereco;
	}

	public void setLograEndereco(String lograEndereco) {
		this.lograEndereco = lograEndereco;
	}

	public String getCepEndereco() {
		return cepEndereco;
	}

	public void setCepEndereco(String cepEndereco) {
		this.cepEndereco = cepEndereco;
	}

	@Override
	public String toString() {
		return "Mae [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", numEndereco="
				+ numEndereco + ", telefone=" + telefone + ", compEndereco=" + compEndereco + ", lograEndereco="
				+ lograEndereco + ", cepEndereco=" + cepEndereco + "]";
	}
	
	
}

/*
AempresaXYZquerinformatizarseusdadosetem,
preliminarmente,quecadastrarseusfuncionários.
Todosrecebemumaidentificaçãointerna,
edevemcadastrarseunome,datadenascimento,seusalário,
apenasumtelefonedecontato(celular).
Quandoofuncionárioforumatendente,
éprecisosaberseuhoráriodeentrada,
seuhoráriodesaídaeseue-mailinstitucional.
Quandoofuncionárioforentregador,
éimportantesaberonúmeroeacategoriadaCNH.
*/