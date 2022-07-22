package com.idat.EC03.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC03.dto.request.ClienteAdd;
import com.idat.EC03.dto.request.ClienteUpdate;
import com.idat.EC03.dto.response.ClienteList;
import com.idat.EC03.model.Cliente;
import com.idat.EC03.reporitory.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClienteRepository repo;
	
	@Override
	public void add(ClienteAdd cliente) {
		// TODO Auto-generated method stub
		Cliente cliente2 = new Cliente();
		
		cliente2.setCelular(cliente.getCelular());
		cliente2.setNombre(cliente.getNombre());
		repo.save(cliente2);
	}

	@Override
	public void update(ClienteUpdate cliente) {
		// TODO Auto-generated method stub
		Cliente cliente2 = new Cliente();
		
		cliente2.setCelular(cliente.getCelular());
		cliente2.setIdCliente(cliente.getIdCliente());
		cliente2.setNombre(cliente.getNombre());
		repo.saveAndFlush(cliente2);
	}

	@Override
	public List<Cliente> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public ClienteList search(Integer id) {
		// TODO Auto-generated method stub
		Cliente cli = repo.findById(id).get();
		ClienteList cliente = new ClienteList();
		cliente.setCelular(cli.getCelular());
		cliente.setIdCliente(cli.getIdCliente());
		cliente.setNombre(cli.getNombre());
		
		return cliente;
	}

	@Override
	public void delete(Integer id) {
		
	}
}
