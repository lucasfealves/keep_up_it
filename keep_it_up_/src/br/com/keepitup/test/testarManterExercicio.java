package br.com.keepitup.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.keepitup.dao.ExercicioDao;
import br.com.keepitup.entity.Exercicio;
import br.com.keepitup.service.ExercicioService;



public class testarManterExercicio {
	
	@Test
	public void testarManterCliente() {
		
		//rotina de cadastro
		Exercicio e = new Exercicio();
		
		e.setId(null);
		e.setNome_exercicio("Supino Reto");
		e.setDescricao("Exercicio realizado de certa forma");
		e.setImagem("stringdaimagem");
		e.setRepeticoes(null);
		e.setPeso(null);
	
		new ExercicioService().salvar(e);
		
		Assert.assertEquals(true,e.getId() != null);		
		
		new ArrayList<Exercicio>();
		
		List<Exercicio> listaExercicios = new ExercicioDao().listar();
		
		Assert.assertEquals(true,listaExercicios.size()>0);
		
	}

}
