package tcc.entra21.SeamSmart.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tcc.entra21.SeamSmart.entities.Referencia;

@Repository
public interface ReferenciaRepository extends CrudRepository<Referencia, Integer>{

}
