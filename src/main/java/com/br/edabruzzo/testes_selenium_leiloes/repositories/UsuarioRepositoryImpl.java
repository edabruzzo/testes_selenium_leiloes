package com.br.edabruzzo.testes_selenium_leiloes.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import com.br.edabruzzo.testes_selenium_leiloes.models.Usuario;

@Component
public class UsuarioRepositoryImpl
    extends Repository<Usuario, Long>
    implements UsuarioRepository {

	UsuarioRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
