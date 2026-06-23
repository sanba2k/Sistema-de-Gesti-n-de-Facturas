package ar.com.unpaz.service;

public interface IServiceFactura {

	void mostrarFacturas();
	
	void buscarFactura(int num);
	
	void eliminarFactura(int num);
	
	double recaudacionTotal();
	
	double facturaMayorTotal();
	
	double facturaMenorTotal();
	
	long cantFacA();
	
	long cantFacB();
	
	void facturaMayor20k();
	
	double promedioGeneral();
	
	void obtenerClientesSinRepetir();
	
	void agruparFacPorTipo();
	
	
	
}
