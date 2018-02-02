package tcc.entra21.SeamSmart.services;

import java.util.Map;
import java.util.Set;

import tcc.entra21.SeamSmart.entities.Endereco;
import tcc.entra21.SeamSmart.entities.Funcionario;
import tcc.entra21.SeamSmart.entities.Pessoa;

public interface FuncionarioService {

	public Funcionario criarFuncionario(String graduacao, Integer carteiraTrabalho, Integer pisCarteiraTrabalho, Integer serieCarteriaTrabalho,
			Pessoa pessoa, Endereco endereco);

	public void removeFuncionario(Funcionario funcionario);

	public void updateFuncionario(Map<String, Object> alteracoes, Integer id);

	public Funcionario consultaFuncionarioPorId(Integer id);

	public Set<Funcionario> consultaTodosOsFuncionarios();
	
}
