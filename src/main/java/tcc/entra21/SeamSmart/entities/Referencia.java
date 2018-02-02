package tcc.entra21.SeamSmart.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import tcc.entra21.SeamSmart.util.PartePeca;
import tcc.entra21.SeamSmart.util.Sexo;
import tcc.entra21.SeamSmart.util.Tamanho;

@Entity
public class Referencia {
	
	@Id
	@Column(name = "id")
	private Integer referencia;
	

	@ManyToOne(targetEntity = Fornecedor.class)
	private Fornecedor fornecedor;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private double valorUnitario;
	
	@Column(nullable = false)
	private double ValorTotal;
	
	@Enumerated(EnumType.STRING)
	private Set<Tamanho> tamanhos;
	
	@Column(nullable = false)
	private Sexo sexo;
	
	@Column(nullable = false)
	private PartePeca partePeca;

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}

	public Set<Tamanho> getTamanhos() {
		return tamanhos;
	}

	public void setTamanhos(Set<Tamanho> tamanhos) {
		this.tamanhos = tamanhos;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public PartePeca getPartePeca() {
		return partePeca;
	}

	public void setPartePeca(PartePeca partePeca) {
		this.partePeca = partePeca;
	}
	
	public Integer getReferencia() {
		return referencia;
	}

	public void setReferencia(Integer referencia) {
		this.referencia = referencia;
	}	
	
}
