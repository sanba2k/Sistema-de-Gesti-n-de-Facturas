package ar.com.unpaz.model;

public class FacturaB extends Facturas{

	private String dni;
	
	public FacturaB(String tipoFactura, int numero, String cliente, double importeBase, String dni) {
		super(tipoFactura, numero, cliente, importeBase);
		
		this.dni = dni;
		
	}
	
	
	@Override
	public double FacturaTotal() {
		double total = getImporteBase() * 1.105;
		
		return total;
	}

	
	
	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	
}
