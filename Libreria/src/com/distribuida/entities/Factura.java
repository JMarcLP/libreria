package com.distribuida.entities;
import java.sql.Date;
import org.springframework.stereotype.Component;

@Component
public class Factura {
	
	//atributos
	private int idFactura;
	private String numFactura;
	private Date fecha;
	private double totalNeto;
	private double iva;
	private double total;
	private Cliente cliente;
	

		
	
	
	
}
