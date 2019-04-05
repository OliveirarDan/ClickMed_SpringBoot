package br.com.click.med.model;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pacientes")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@Column(unique = true)
	private String cpf;
	@NotNull
	private String nome;
	@NotNull
	private String sobrenome;
	private Date dataNascimento;
	private String cidade;
	@Column(length = 2)
	private String estado;
	private String nomeRua;
	private String numero;
	@Column(length = 8)
	private String cep;
	private Blob foto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Blob getFoto() {
		return foto;
	}

	public void setFoto(Blob foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", sobrenome=" + sobrenome
				+ ", dataNascimento=" + dataNascimento + ", cidade=" + cidade + ", estado=" + estado + ", nomeRua="
				+ nomeRua + ", numero=" + numero + ", cep=" + cep + ", foto=" + foto + "]";
	}

	public Paciente(int id, @NotNull String cpf, @NotNull String nome, @NotNull String sobrenome, Date dataNascimento,
			String cidade, String estado, String nomeRua, String numero, String cep, Blob foto) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.cidade = cidade;
		this.estado = estado;
		this.nomeRua = nomeRua;
		this.numero = numero;
		this.cep = cep;
		this.foto = foto;
	}

}
