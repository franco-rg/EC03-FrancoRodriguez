package com.idat.EC03.service;

import java.util.List;

import com.idat.EC03.dto.request.ClienteAdd;
import com.idat.EC03.dto.request.ClienteUpdate;
import com.idat.EC03.dto.response.ClienteList;
import com.idat.EC03.model.Cliente;

public interface ClienteService {
	public void add(ClienteAdd cliente);
	public void update(ClienteUpdate cliente);
	public List<Cliente> list();
	public ClienteList search(Integer id);
	public void delete(Integer id);
}