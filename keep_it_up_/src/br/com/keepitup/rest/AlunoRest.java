package br.com.keepitup.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.keepitup.dao.AlunoDao;
import br.com.keepitup.entity.Aluno;
import br.com.keepitup.service.AlunoService;
import br.com.keepitup.service.ServiceException;

@Path("/alunorest")
public class AlunoRest {
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Aluno aluno) {
		try {
			new AlunoService().salvar(aluno);
		} catch (ServiceException e) {			
			e.printStackTrace();
		}	
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Aluno> listar() {
		List<Aluno> listaAlunos = new AlunoDao().listar();
		return listaAlunos;
	}
	

}
