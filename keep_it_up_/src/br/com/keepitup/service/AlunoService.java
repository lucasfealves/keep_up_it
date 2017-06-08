package br.com.keepitup.service;

import br.com.keepitup.dao.FactoryDao;
import br.com.keepitup.dao.InterfaceDao;
import br.com.keepitup.entity.Aluno;

public class AlunoService {
	
	public void salvar(Aluno a) throws ServiceException {
	if (a.getIdade() < 15) {
		throw new ServiceException("RN01 - A idade deve ser maior que 15");					
	}
	InterfaceDao<Aluno> daoAluno = 
			FactoryDao.createAlunoDao();
	
	daoAluno.salvar(a);
	}	

}
