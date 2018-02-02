package tcc.entra21.SeamSmart.entities;

import java.util.Map;

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
	@Column(nullable = false)
	private Integer referencia;
	
	@Column(nullable = false)
	private String descricao;
	
	@ManyToOne(targetEntity = Fornecedor.class)
	private Fornecedor fornecedor;
	
	@Column(nullable = false)
	private Double valorUnitario;
	
	@Column(nullable = false)
	private Double valorTotal;
	
	@Enumerated(EnumType.STRING)
	private Map<Tamanho, Integer> tamanhos;

	@Enumerated(EnumType.STRING)
	private PartePeca partePeca;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	

	public Integer getReferencia() {
		return referencia;
	}

	public void setReferencia(Integer referencia) {
		this.referencia = referencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Map<Tamanho, Integer> getTamanhos() {
		return tamanhos;
	}

	public void setTamanhos(Map<Tamanho, Integer> tamanhos) {
		this.tamanhos = tamanhos;
	}

	public PartePeca getPartePeca() {
		return partePeca;
	}

	public void setPartePeca(PartePeca partePeca) {
		this.partePeca = partePeca;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	
}
