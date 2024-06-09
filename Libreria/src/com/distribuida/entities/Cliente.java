package com.distribuida.entities;
import org.springframework.stereotype.Component;

@Component
public class Cliente {

	// atributos
	private int idCliente;
	private String cedula;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telfono;
	private String correo;
	
	
	//constructores
	public Cliente() {	}


	public Cliente(int idCliente, String cedula, String nombre, String apellido, String direccion, String telfono,
			String correo) {
		this.idCliente = idCliente;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telfono = telfono;
		this.correo = correo;
	}
	
	//metodos getters and setters

	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelfono() {
		return telfono;
	}


	public void setTelfono(String telfono) {
		this.telfono = telfono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", direccion=" + direccion + ", telfono=" + telfono + ", correo=" + correo + "]";
	}
		
	
	
	
	
	
}
