package br.com.keepitup.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.keepitup.entity.Treino;

public class TreinoDao implements InterfaceDao<Treino> {

	@Override
	public void salvar(Treino t) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(t);
		
		em.getTransaction().commit();
		
	}

	@Override
	public void excluir(Treino t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Treino> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		Query q = em.createQuery("from Treino");
		return q.getResultList();
	}

}
