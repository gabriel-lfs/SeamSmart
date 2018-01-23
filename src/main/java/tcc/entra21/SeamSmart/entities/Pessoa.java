package tcc.entra21.SeamSmart.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Pessoa extends Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private Integer cpf;

	@Column(nullable = false)
	private Integer rg;

	@Column(nullable = false)
	private LocalDate dataNascimento;

	@Column(nullable = false)
	private Character sexo;

	@Column(nullable = true)
	private Integer telefone;

	@Column(nullable = true)
	private Integer celular;

	@Column(nullable = true)
	private String email;

	// Construtor
	public Pessoa(String cidade, String estado, String cep, String bairro, String rua, Integer numero,
			String complemento, String nome, Integer cpf, Integer rg, LocalDate dataNascimento, Character sexo,
			Integer telefone, Integer celular, String email) {
		super(cidade, estado, cep, bairro, rua, numero, complemento);
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setDataNascimento(dataNascimento);
		setSexo(sexo);
		setTelefone(telefone);
		setCelular(celular);
		setEmail(email);
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
