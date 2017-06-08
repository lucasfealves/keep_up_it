package br.com.keepitup.service;

import br.com.keepitup.dao.FactoryDao;
import br.com.keepitup.dao.InterfaceDao;
import br.com.keepitup.entity.Treino;

public class TreinoService {
	
	public void salvar(Treino t) {
		
		InterfaceDao<Treino> daoTreino = 
				FactoryDao.createTreinoDao();
		
		daoTreino.salvar(t);
		}	

}
