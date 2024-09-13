package application.repository.Pessoa;

import org.springframework.data.repository.CrudRepository;

import application.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

    
}