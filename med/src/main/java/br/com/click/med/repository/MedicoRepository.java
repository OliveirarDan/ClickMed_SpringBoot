package br.com.click.med.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.click.med.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long>  {

}
