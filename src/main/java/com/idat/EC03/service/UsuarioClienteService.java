package com.idat.EC03.service;

import java.util.List;

import com.idat.EC03.dto.request.UsuarioClienteAdd;
import com.idat.EC03.dto.request.UsuarioClienteUpdate;
import com.idat.EC03.model.UsuarioCliente;

public interface UsuarioClienteService {
	public void add(UsuarioClienteAdd usrCliente);
	public void update(UsuarioClienteUpdate usrCliente);
	public List<UsuarioCliente> listar();
	public UsuarioCliente search(Integer id);
	public void delete(Integer id);
}