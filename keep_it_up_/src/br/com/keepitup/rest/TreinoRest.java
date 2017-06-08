package br.com.keepitup.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.keepitup.dao.TreinoDao;
import br.com.keepitup.entity.Treino;
import br.com.keepitup.service.TreinoService;

@Path("/treinorest")
public class TreinoRest {
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Treino treino) {
		new TreinoService().salvar(treino);
	}	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Treino> listar() {
		List<Treino> listaTreinos = new TreinoDao().listar();
		return listaTreinos;
	}
	
}


