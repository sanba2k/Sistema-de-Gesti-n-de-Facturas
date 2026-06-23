package ar.com.unpaz.repo;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.unpaz.model.Facturas;
import ar.com.unpaz.service.IServiceFactura;

public class FacturaImp implements IServiceFactura{

	LeerArchivo lectura = new LeerArchivo();
	HashMap<Integer, Facturas> mapa = lectura.Lectura();
	
	@Override
	public void mostrarFacturas() {
		for(Facturas c: mapa.values()) {
			System.out.println(c);
			System.out.println(c.FacturaTotal());
		}
		
		
	}

	@Override
	public void buscarFactura(int num) {
		Facturas f = mapa.get(num);
		
		if(f != null) {
			System.out.println(f);
		} else {
			System.out.println("Factura No Encontrada");
		}

		
	}

	@Override
	public void eliminarFactura(int num) {
		Facturas f = mapa.remove(num);
		
		if(f != null) {
			System.out.println("Cuenta Borrada");
		} else {
			System.out.println("Cuenta no encontrada");
		}
		
	}

	@Override
	public double recaudacionTotal() {
		double total= mapa.values().stream().mapToDouble(a -> a.FacturaTotal()).sum();
		
		return total;
		
	}

	@Override
	public double facturaMayorTotal() {
		double total = mapa.values().stream().mapToDouble(a -> a.FacturaTotal()).max().orElse(0.0);
				
		return total;
	}

	@Override
	public double facturaMenorTotal() {
		double total = mapa.values().stream().mapToDouble(a -> a.FacturaTotal()).min().orElse(0.0);
		
		return total;
	}

	@Override
	public long cantFacA() {
		long cant = mapa.values().stream().filter(a -> a.getTipoFactura().equals("A")).count();
		
		return cant;
	}

	@Override
	public long cantFacB() {
		long cant = mapa.values().stream().filter(a -> a.getTipoFactura().equals("B")).count();
		
		return cant;
	}

	@Override
	public void facturaMayor20k() {
		mapa.values().stream().filter(a -> a.FacturaTotal() > 20000).forEach(a -> System.out.println(a));
		
	}

	@Override
	public double promedioGeneral() {
		double promedio = mapa.values().stream().mapToDouble(a -> a.FacturaTotal()).average().orElse(0.0);
	
		return promedio;
	}

	@Override
	public void obtenerClientesSinRepetir() {
	    mapa.values().stream()
	        .map(a -> a.getClass())
	        .distinct()
	        .forEach(a -> System.out.println(a));
	}

	@Override
	public void agruparFacPorTipo() {
		List<Facturas> lista = mapa.values().stream().filter(a -> a.getTipoFactura().equals("A")).collect(Collectors.toList());
		
		List<Facturas> listaB = mapa.values().stream().filter(a -> a.getTipoFactura().equals("B")).collect(Collectors.toList());
		
		lista.forEach(a -> System.out.println("Facturas A:    " + a ) );
		
		listaB.forEach(b -> System.out.println("Facturas B:    " + b ) );
	}

}
