package com.distribuida.entities;

import java.sql.Date;

public class Factura {
	
	//atributos
	private int idFactura;
	private String numFactura;
	private Date fecha;
	private double totalNeto;
	private double iva;
	private double total;
	private int idCliente;
	
		//constructores
		public Factura(int idFactura, String numFactura, Date fecha, double totalNeto, double iva, double total,
			int idCliente) {
		this.idFactura = idFactura;
		this.numFactura = numFactura;
		this.fecha = fecha;
		this.totalNeto = totalNeto;
		this.iva = iva;
		this.total = total;
		this.idCliente = idCliente;
	}

		//metodos getters and setters
		public int getIdFactura() {
			return idFactura;
		}

		public void setIdFactura(int idFactura) {
			this.idFactura = idFactura;
		}

		public String getNumFactura() {
			return numFactura;
		}

		public void setNumFactura(String numFactura) {
			this.numFactura = numFactura;
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

		public double getTotalNeto() {
			return totalNeto;
		}

		public void setTotalNeto(double totalNeto) {
			this.totalNeto = totalNeto;
		}

		public double getIva() {
			return iva;
		}

		public void setIva(double iva) {
			this.iva = iva;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public int getIdCliente() {
			return idCliente;
		}

		public void setIdCliente(int idCliente) {
			this.idCliente = idCliente;
		}

		//to string
		@Override
		public String toString() {
			return "Factura [idFactura=" + idFactura + ", numFactura=" + numFactura + ", fecha=" + fecha
					+ ", totalNeto=" + totalNeto + ", iva=" + iva + ", total=" + total + ", idCliente=" + idCliente
					+ "]";
		}
	
		
		
	
	
	
}
