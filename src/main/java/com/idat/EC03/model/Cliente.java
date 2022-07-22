package com.idat.EC03.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity(name = "cliente")
@Table
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombre;
	private String celular;
	
	@ManyToMany(mappedBy = "cliente", cascade = {CascadeType.PERSIST,CascadeType.MERGE}) 
	private List<Hospital> hospital = new ArrayList<Hospital>();
	
	@OneToOne(mappedBy = "cliente")
	private UsuarioCliente usuarioCliente;
	
	public Integer getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
}