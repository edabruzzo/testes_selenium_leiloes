package com.br.edabruzzo.testes_selenium_leiloes.repositories;

import com.br.edabruzzo.testes_selenium_leiloes.models.Lance;

public interface LanceRepository {

	void salvar(Lance lance);
	Lance porId(Long id);
}
