package br.com.keepitup.service;

import br.com.keepitup.dao.FactoryDao;
import br.com.keepitup.dao.InterfaceDao;
import br.com.keepitup.entity.Exercicio;


public class ExercicioService {
	
public void salvar(Exercicio e) {
		
		InterfaceDao<Exercicio> daoExercicio = 
				FactoryDao.createExercicioDao();
		
		daoExercicio.salvar(e);
		}	

}
