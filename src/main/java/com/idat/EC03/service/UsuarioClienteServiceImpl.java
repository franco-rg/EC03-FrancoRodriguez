package com.idat.EC03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EC03.dto.request.UsuarioClienteAdd;
import com.idat.EC03.dto.request.UsuarioClienteUpdate;
import com.idat.EC03.model.Cliente;
import com.idat.EC03.model.UsuarioCliente;
import com.idat.EC03.reporitory.ClienteRepository;
import com.idat.EC03.reporitory.UsuarioClienteRepository;

public class UsuarioClienteServiceImpl implements UsuarioClienteService {
	
	@Autowired
    UsuarioClienteRepository repo;

    @Autowired
    ClienteRepository repoCli;

	@Override
	public void add(UsuarioClienteAdd usrCliente) {
		// TODO Auto-generated method stub
		UsuarioCliente u = new UsuarioCliente();
        u.setUsuario(usrCliente.getUsuario());
        u.setPassword(usrCliente.getPassword());
        u.setRol(usrCliente.getRol());

        Cliente cliente = repoCli.findById(usrCliente.getIdCliente()).get();
        u.setCliente(cliente);
        repo.save(u);
	}

	@Override
	public void update(UsuarioClienteUpdate usrCliente) {
		// TODO Auto-generated method stub
		UsuarioCliente u = new UsuarioCliente();
        u.setUsuario(usrCliente.getUsuario());
        u.setPassword(usrCliente.getPassword());
        u.setRol(usrCliente.getRol());
        repo.saveAndFlush(u);
	}

	@Override
	public List<UsuarioCliente> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public UsuarioCliente search(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
