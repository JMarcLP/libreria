package com.distribuida.dao;
import java.util.List;
import com.distribuida.entities.Cliente;

public interface ClienteDao {
	
	//CRUD
	public List<Cliente> findAll(); //filtrar todo
	public Cliente findOne(int id); //filtrar por cliente
	public void add(Cliente cliente); //agregar nuevo cliente
	public void up(Cliente cliente); //actualizar cliente
	public void del(Cliente cliente); //eliminar un cliente
	//CRUD
	
	

}
