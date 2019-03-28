package com.br.edabruzzo.testes_selenium_leiloes.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;

import com.br.edabruzzo.testes_selenium_leiloes.models.Lance;

@Component
public class LanceRepositoryImpl extends Repository<Lance, Long> implements LanceRepository{

	public LanceRepositoryImpl(EntityManager em) {
		super(em);
	}
	
	@Override
	public void salvar(Lance lance) {
		entityManager.persist(lance);
	}

	@Override
	public Lance porId(Long id) {
		return entityManager.find(Lance.class, id);
	}

}
