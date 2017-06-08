package br.com.keepitup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.keepitup.entity.Aluno;

public class AlunoDao implements InterfaceDao<Aluno> {

	@Override
	public void salvar(Aluno a) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(a);
		
		em.getTransaction().commit();
		
	}

	@Override
	public void excluir(Aluno a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Aluno> listar() {
		EntityManager em = Conexao.
				getInstance().createEntityManager();
		Query q = em.createQuery("from Aluno");
		return q.getResultList();
	}

}
