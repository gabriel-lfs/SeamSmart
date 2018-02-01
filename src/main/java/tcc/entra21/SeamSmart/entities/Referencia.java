package tcc.entra21.SeamSmart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Referencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(targetEntity = Fornecedor.class)
	private Fornecedor fornecedor;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private double valorUnitario;
	
	@Column(nullable = false)
	private double ValorTotal;
	
	
	
}
