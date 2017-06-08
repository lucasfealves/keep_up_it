package br.com.keepitup.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.keepitup.dao.ExercicioDao;
import br.com.keepitup.entity.Exercicio;
import br.com.keepitup.service.ExercicioService;



@Path("/exerciciorest")
public class ExercicioRest {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Exercicio exercicio) {
			new ExercicioService().salvar(exercicio);	
	}	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Exercicio> listar() {
		List<Exercicio> listaExercicios = new ExercicioDao().listar();
		return listaExercicios;
	}

}
