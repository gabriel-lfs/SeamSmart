package tcc.entra21.SeamSmart.services;

import java.util.Map;
import java.util.Set;

import tcc.entra21.SeamSmart.entities.Endereco;
import tcc.entra21.SeamSmart.entities.Fornecedor;

public interface FornecedorService {

	public Fornecedor criarFornecedor(String nomeFantasia, String razaoSocial, Integer cnpj, String inscricaoEstadual,
			Integer telefone, Endereco endereco);

	public void removeFornecedor(Fornecedor fornecedor);

	public void updateFornecedor(Map<String, Object> alteracoes, Integer id);

	public Fornecedor consultaFornecedorPorId(Integer id);

	public Set<Fornecedor> consultaTodosOsFornecedores();

}
