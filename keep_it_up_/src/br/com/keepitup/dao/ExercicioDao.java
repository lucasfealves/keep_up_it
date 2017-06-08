package br.com.keepitup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.keepitup.entity.Exercicio;

public class ExercicioDao implements InterfaceDao<Exercicio> {

	@Override
	public void salvar(Exercicio e) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(e);
		
		em.getTransaction().commit();
		
	}

	@Override
	public void excluir(Exercicio e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Exercicio> listar() {
		EntityManager em = Conexao.
				getInstance().createEntityManager();
		Query q = em.createQuery("from Exercicio");
		return q.getResultList();
	}

}
