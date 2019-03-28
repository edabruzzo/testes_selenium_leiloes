package com.br.edabruzzo.testes_selenium_leiloes.repositories;

import java.util.List;

import com.br.edabruzzo.testes_selenium_leiloes.models.Usuario;

public interface UsuarioRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Usuario entity);
	
	Usuario update(Usuario entity);
	
	void destroy(Usuario entity);
	
	Usuario find(Long id);
	
	List<Usuario> findAll();

}
