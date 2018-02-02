package tcc.entra21.SeamSmart.services;

import java.util.Map;
import java.util.Set;

import tcc.entra21.SeamSmart.entities.Fornecedor;
import tcc.entra21.SeamSmart.entities.Referencia;
import tcc.entra21.SeamSmart.util.PartePeca;
import tcc.entra21.SeamSmart.util.Sexo;
import tcc.entra21.SeamSmart.util.Tamanho;

public interface ReferenciaService {

	public Referencia criarReferencia(Integer referencia, String descricao, Fornecedor fornecedor, Double valorUnitario,
			Double valorTotal, Map<Tamanho, Integer> tamanhos, PartePeca partePeca, Sexo sexo);

	public void removeReferencia(Referencia referencia);

	public void updateReferencia(Map<String, Object> alteracoes, Integer id);

	public Referencia consultaReferenciaPorId(Integer id);

	public Set<Referencia> consultaTodosOsReferencias();
	
}
