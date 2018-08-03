package com.michael.crudmongo.dto;

import java.io.Serializable;

import com.michael.crudmongo.domain.Usuario;

public class UsuarioDTO implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String email;
	private String cpf;
	
	public UsuarioDTO() {		
	}
	
	public UsuarioDTO(Usuario obj) {//este contrutor instancia apartir do objeto Entity
		id = obj.getId();
		nome = obj.getNome();
		email = obj.getEmail();
		cpf = obj.getCpf();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
