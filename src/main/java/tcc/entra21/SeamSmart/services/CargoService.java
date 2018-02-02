package tcc.entra21.SeamSmart.services;

import java.util.Map;
import java.util.Set;

import tcc.entra21.SeamSmart.entities.Cargo;

public interface CargoService {

	public Cargo criarCargo(String nome, Integer permissao);
	
	public void removeCargo(Cargo cargo);
	
	public void updateCargo(Map<String, Object> alteracoes, Integer id);
	
	public Cargo consultaCargoPorId(Integer id);
	
	public Set<Cargo> consultaTodosOsCargos();
}
