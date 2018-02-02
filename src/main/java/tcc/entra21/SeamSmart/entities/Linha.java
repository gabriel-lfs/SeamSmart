package tcc.entra21.SeamSmart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Linha {

	@Id
	@Column(nullable = false)
	private Integer codigoCor;
	
	@Column(nullable = false)
	private String corNome;

	public Integer getCodigoCor() {
		return codigoCor;
	}

	public void setCodigoCor(Integer codigoCor) {
		this.codigoCor = codigoCor;
	}

	public String getCorNome() {
		return corNome;
	}

	public void setCorNome(String corNome) {
		this.corNome = corNome;
	}
	
}
