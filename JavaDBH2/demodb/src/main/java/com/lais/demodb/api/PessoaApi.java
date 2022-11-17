package com.lais.demodb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lais.demodb.model.Pessoa;
import com.lais.demodb.service.PessoaService;



@RestController
@RequestMapping(name= "pessoa")
public class PessoaApi {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping
	public List<Pessoa> findAll(){
		return this.pessoaService.findAll();		
	}

}
