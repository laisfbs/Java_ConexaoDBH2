package com.lais.demodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lais.demodb.model.Pessoa;
import com.lais.demodb.repository.IPessoaRepository;

@Service
public class PessoaService {
	
	/*O spring trabalha com injecao entre camadas,
	 *  ou seja vc precisa dizer que quer usar determinada camada
	 * 
	 */
	
	@Autowired
	private IPessoaRepository pessoaRepository;
	
	
	public List<Pessoa> findAll(){
		
		List<Pessoa> pessoas = (List<Pessoa>) this.pessoaRepository.findAll();
		
		/*aqui vc valida os dados que precisam/
		 * 
		 */
		
		return pessoas;
		
	}

}
