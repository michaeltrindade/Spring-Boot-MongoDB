package com.michael.crudmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.michael.crudmongo.domain.Usuario;
import com.michael.crudmongo.repository.UsuarioRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Override
	public void run(String... args) throws Exception {
		
		usuarioRepository.deleteAll();
		
		Usuario davi = new Usuario(null, "Davi", "davi@gmail.com", "02048429726");
		Usuario michael = new Usuario(null, "Michael", "michael@gmail.com", "70714278360");
		Usuario carlesse = new Usuario(null, "carlesse", "carlesse@gmail.com", "26571630842");
		usuarioRepository.saveAll(Arrays.asList(davi, michael, carlesse));
	}

}
