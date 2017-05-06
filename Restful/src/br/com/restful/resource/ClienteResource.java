package br.com.restful.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.restful.controller.ClienteController;
import br.com.restful.model.Cliente;

@Path("/cliente")
public class ClienteResource {
	
	
	/**
	 * 
	 * @return
	 */
	@GET
	@Path("listarTodos")
	@Produces("application/json")
	public ArrayList<Cliente> listarTodos(){
		return new ClienteController().listarTodos();
	}
	
	/**
	 * 
	 * @return
	 */
	@POST
	@Path("buscarCliente")
	@Produces("application/json")
	public ArrayList<Cliente> buscarClienteByNome(Cliente cliente){
		return new ClienteController().buscarClienteByNome(cliente);
	}
}
