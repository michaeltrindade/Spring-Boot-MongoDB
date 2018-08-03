package com.michael.crudmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.michael.crudmongo.domain.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String>{
/**
 * com este objeto  "UsuarioRepository" é possivel efetuar varias operações 
 * como por exemplo: salvar, deletar, atualizar e recuperaretc..
 */
	
}
