package tcc.entra21.SeamSmart.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class OrdemServico {

	@Id
	@Column(nullable = false)
	private Integer numeroOrdem;
	
	@ManyToOne(targetEntity = Fornecedor.class)
	private Fornecedor fornecedor;
	
	public Integer getNumeroOrdem() {
		return numeroOrdem;
	}

	public void setNumeroOrdem(Integer numeroOrdem) {
		this.numeroOrdem = numeroOrdem;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Referencia getReferencia() {
		return referencia;
	}

	public void setReferencia(Referencia referencia) {
		this.referencia = referencia;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	@OneToOne(targetEntity = Referencia.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Referencia referencia;
	
	@Column(nullable = false)
	@DateTimeFormat	
	private LocalDate dataEntrada;
	
	@Column(nullable = false)
	@DateTimeFormat	
	private LocalDate dataSaida;
	
	
	
}
