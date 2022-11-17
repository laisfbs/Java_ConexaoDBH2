package com.lais.demodb.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/*
 * Essa classe ira espelhar a tabela do banco de dados
 * ou seja a tabela criada la sera transformada em Java aqui nessa classe
 */
@Data
@Entity
@Table(name =  "pessoa")
public class Pessoa {

	@Id //PK chave primaria
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	
	@Column(name =  "nome")
	private String nome;

}
