package br.com.keepitup.dao;

import br.com.keepitup.entity.Aluno;
import br.com.keepitup.entity.Exercicio;
import br.com.keepitup.entity.Treino;


public class FactoryDao {
	
	public static InterfaceDao<Aluno> createAlunoDao() {
		return new AlunoDao();
	}
	
	public static InterfaceDao<Treino> createTreinoDao() {
		return new TreinoDao();
	}
	
	public static InterfaceDao<Exercicio> createExercicioDao() {
			return new ExercicioDao();		
	}
}
