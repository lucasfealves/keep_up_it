package br.com.keepitup.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.keepitup.dao.TreinoDao;
import br.com.keepitup.entity.Aluno;
import br.com.keepitup.entity.Exercicio;
import br.com.keepitup.entity.Treino;



public class TestManterTreino {
	
	@Test
	public void TestManterCliente() {
		
		//rotina de cadastro
		Aluno a = new Aluno();
		
		a.setMatricula(null);
		a.setData_matricula("20-06-1989");
		a.setData_cancelamento(null);
		a.setStatus("Ativo");
		a.setNome_aluno("Pedro Alves");
		a.setCpf("077-699-079-55");
		a.setEmail("pedroalves@gmail.com");
		a.setSexo("Masculino");
		a.setIdade(22);
		a.setTelefone("(41)93344-3322");
		a.setEndereco("Rua manuel");
		a.setNumero(654);
		a.setBairro("Lagos");
		
		Exercicio e = new Exercicio();
		
		e.setId(null);
		e.setNome_exercicio("Supino Reto");
		e.setDescricao("Exercicio realizado de certa forma");
		e.setImagem("stringdaimagem");
		e.setRepeticoes(null);
		e.setPeso(null);
		
		Treino t = new Treino();
		
		t.setId(null);
		t.setAluno(a);
		t.setExercicio(e);
		t.setData_criacao("20/06/1989");
		t.setData_troca("20/11/1989");
			
		
		
		Assert.assertEquals(true,t.getId() != null);		
		
		new ArrayList<Treino>();
		
		List<Treino> listaTreinos = new TreinoDao().listar();
		
		Assert.assertEquals(true,listaTreinos.size()>0);
		
	}

}
