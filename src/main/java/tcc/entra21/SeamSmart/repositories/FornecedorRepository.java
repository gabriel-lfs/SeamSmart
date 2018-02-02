package tcc.entra21.SeamSmart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tcc.entra21.SeamSmart.entities.Fornecedor;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer>{

	
	
	
}
