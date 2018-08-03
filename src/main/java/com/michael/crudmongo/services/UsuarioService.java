package com.michael.crudmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.crudmongo.domain.Usuario;
import com.michael.crudmongo.dto.UsuarioDTO;
import com.michael.crudmongo.repository.UsuarioRepository;
import com.michael.crudmongo.services.exception.ObjectNotFoundException;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository rep;
	
	public List<Usuario> findAll(){
		return rep.findAll();
	}
	
	public Usuario findById(String id) {
		Optional<Usuario> obj = rep.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public Usuario insert(Usuario obj) {
		return rep.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		rep.deleteById(id);
	}
	
	public Usuario atualizar(Usuario obj) {
		Usuario novoObj = findById(obj.getId());
		updateData(novoObj, obj);
		return rep.save(novoObj);
	}
	
	private void updateData(Usuario novoObj, Usuario obj) {
		novoObj.setNome(obj.getNome());
		novoObj.setEmail(obj.getEmail());
		novoObj.setCpf(obj.getCpf());
	}
	
	public Usuario fromDTO(UsuarioDTO objDto) {
		return new Usuario(objDto.getId(), objDto.getNome(), objDto.getEmail(), objDto.getCpf());
	}
}
