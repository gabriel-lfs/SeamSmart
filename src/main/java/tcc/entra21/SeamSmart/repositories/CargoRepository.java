package tcc.entra21.SeamSmart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tcc.entra21.SeamSmart.entities.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer> {

}
