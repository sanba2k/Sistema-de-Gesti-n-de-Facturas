package ar.com.unpaz.inicio;

import ar.com.unpaz.repo.FacturaImp;
import ar.com.unpaz.service.IServiceFactura;

public class Inicio {

	public static void main(String[] args) {
		
		IServiceFactura servicio = new FacturaImp();
		
		// servicio.mostrarFacturas();
		
		// servicio.buscarFactura(1005);

		// servicio.eliminarFactura(1005);
		
		// System.out.println(servicio.recaudacionTotal());
		
		// System.out.println(servicio.facturaMayorTotal());
		
		// System.out.println(servicio.facturaMenorTotal());
		
		// System.out.println(servicio.cantFacA());
		
		// System.out.println(servicio.cantFacB());
	
		// servicio.facturaMayor20k();
		
		// System.out.println(servicio.promedioGeneral());
	
		// servicio.obtenerClientesSinRepetir();
		
		// servicio.agruparFacPorTipo();
	}

}
