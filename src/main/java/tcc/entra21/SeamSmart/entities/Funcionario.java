package tcc.entra21.SeamSmart.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne(targetEntity = Pessoa.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Pessoa pessoa;
	
	@OneToOne(targetEntity = Endereco.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Endereco endereco;

	@Column(nullable = false)
	private String graducao;

	@Column(nullable = false)
	private Integer carteiraTrabalho;

	@Column(nullable = false)
	private Integer pisCarteiraTrabalho;

	@Column(nullable = false)
	private String serieCarteiraTrabalho;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Cargo.class)
	@Column(nullable = false)
	private Cargo cargo;

	@OneToOne(targetEntity = Login.class, mappedBy = "funcionario")
	private Login loginUsuario;
	
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGraducao() {
		return graducao;
	}

	public void setGraducao(String graducao) {
		this.graducao = graducao;
	}

	public Integer getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(Integer carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	public Integer getPisCarteiraTrabalho() {
		return pisCarteiraTrabalho;
	}

	public void setPisCarteiraTrabalho(Integer pisCarteiraTrabalho) {
		this.pisCarteiraTrabalho = pisCarteiraTrabalho;
	}

	public String getSerieCarteiraTrabalho() {
		return serieCarteiraTrabalho;
	}

	public void setSerieCarteiraTrabalho(String serieCarteiraTrabalho) {
		this.serieCarteiraTrabalho = serieCarteiraTrabalho;
	}

	public Login getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(Login loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
