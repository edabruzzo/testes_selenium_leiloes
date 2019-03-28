package com.br.edabruzzo.testes_selenium_leiloes.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import com.br.edabruzzo.testes_selenium_leiloes.models.Leilao;

@Component
public class LeilaoRepositoryImpl
    extends Repository<Leilao, Long>
    implements LeilaoRepository {

	LeilaoRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
