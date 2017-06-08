package br.com.keepitup.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("keep_it_up");

	public static EntityManagerFactory getInstance() {
		return emf;
	}

}
