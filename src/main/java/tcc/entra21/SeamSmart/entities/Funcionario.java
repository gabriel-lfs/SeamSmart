package tcc.entra21.SeamSmart.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Funcionario extends Pessoa {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(nullable = false)
	private String graducao;

	@Column(nullable = false)
	private Integer carteiraTrabalho;

	@Column(nullable = false)
	private Integer pisCarteiraTrabalho;

	@Column(nullable = false)
	private String serieCarteiraTrabalho;
	
	@Column(nullable = false)
	private String cargo;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	// Construtor
	public Funcionario(String cidade, String estado, String cep, String bairro, String rua, Integer numero,
			String complemento, String nome, Integer cpf, Integer rg, LocalDate dataNascimento, Character sexo,
			Integer telefone, Integer celular, String email, String graducao, Integer carteiraTrabalho,
			Integer pisCarteiraTrabalho, String serieCarteiraTrabalho, String cargo) {
		super(cidade, estado, cep, bairro, rua, numero, complemento, nome, cpf, rg, dataNascimento, sexo, telefone,
				celular, email);
		
		setGraducao(graducao);
		setCarteiraTrabalho(carteiraTrabalho);
		setPisCarteiraTrabalho(pisCarteiraTrabalho);
		setSerieCarteiraTrabalho(serieCarteiraTrabalho);
		setCargo(cargo);
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

}
