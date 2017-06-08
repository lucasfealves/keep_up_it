package br.com.keepitup.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.keepitup.dao.AlunoDao;
import br.com.keepitup.entity.Aluno;
import br.com.keepitup.service.AlunoService;
import br.com.keepitup.service.ServiceException;


public class TestManterAluno {
	
	@Test
	public void TestManterAluno() {
		
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
		
		
		try {
			new AlunoService().salvar(a);
		} catch (ServiceException e) {			
			e.printStackTrace();
		}	
		
		Assert.assertEquals(true,a.getMatricula() != null);		
		
		new ArrayList<Aluno>();
		
		List<Aluno> listaAlunos = new AlunoDao().listar();
		
		Assert.assertEquals(true,listaAlunos.size()>0);
		
	}


}
