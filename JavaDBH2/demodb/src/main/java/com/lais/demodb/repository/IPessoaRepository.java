package com.lais.demodb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lais.demodb.model.Pessoa;

@Repository
public interface IPessoaRepository extends CrudRepository<Pessoa, Long>{

	Pessoa findAll(String PessoaName);

	/*-------------------ANTIGA DAO
	 * Aqui eu ja tenho por padrao implemntado os eguintes metodos:
	 * -save
	 * -update
	 * -findaAll
	 * -findById
	 * -delete
	 */
}
