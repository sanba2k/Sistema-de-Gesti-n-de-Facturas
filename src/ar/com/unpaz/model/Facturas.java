package ar.com.unpaz.model;

public abstract class Facturas {

	private String tipoFactura;
	private int numero;
	private String cliente;
	private double importeBase;
	
	public Facturas(String tipoFactura, int numero, String cliente, double importeBase) {
		this.tipoFactura = tipoFactura;
		this.numero = numero;
		this.cliente = cliente;
		this.importeBase = importeBase;
				
	}
	
	public Facturas() {
		
	}

	
	public abstract double FacturaTotal();
	
	
	public String getTipoFactura() {
		return tipoFactura;
	}

	public void setTipoFactura(String tipoFactura) {
		this.tipoFactura = tipoFactura;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getImporteBase() {
		return importeBase;
	}

	public void setImporteBase(double importeBase) {
		this.importeBase = importeBase;
	}

	@Override
	public String toString() {
		return "Facturas [tipoFactura=" + tipoFactura + ", numero=" + numero + ", cliente=" + cliente + ", importeBase="
				+ importeBase + "]";
	}


	
	
	
}
