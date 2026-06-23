package ar.com.unpaz.model;

public class FacturaA extends Facturas{

	private String cuit;
	
	public FacturaA(String tipoFactura, int numero, String cliente, double importeBase, String cuit) {
		super(tipoFactura, numero, cliente, importeBase);
		
		this.cuit = cuit;
		
	}
	
	@Override
	public double FacturaTotal() {
		double total = getImporteBase() * 1.21;

		return total;
	}

	

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	
	
}
