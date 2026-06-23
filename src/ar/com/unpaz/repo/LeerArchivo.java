package ar.com.unpaz.repo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

import ar.com.unpaz.model.FacturaA;
import ar.com.unpaz.model.FacturaB;
import ar.com.unpaz.model.Facturas;
import ar.com.unpaz.service.IServiceLeerArchivo;

public class LeerArchivo implements IServiceLeerArchivo{

	@Override
	public HashMap<Integer, Facturas> Lectura() {
		HashMap<Integer,Facturas> mapa = new HashMap<Integer,Facturas>();
		
		File sfile = new File("src/facturas.txt");
	try {
		FileReader fiRe = new FileReader(sfile);
		BufferedReader buffer = new BufferedReader(fiRe);
		String linea = "";
		while((linea = buffer.readLine()) != null) {
			String [] array = linea.split(";");
			String tipo = array[0];
			int numero = Integer.parseInt(array[1]);
			String cliente = array[2];
			double importeBase = Double.parseDouble(array[3]);
			
			switch(tipo) {
			case "A":
				String cuit = array[4];
				FacturaA facA = new FacturaA(tipo, numero, cliente, importeBase, cuit);
				mapa.put(numero, facA);
				
			case "B":
				String dni = array[4];
				FacturaB facB = new FacturaB(tipo, numero, cliente, importeBase, dni);
				mapa.put(numero, facB);

			}
			
		}
		buffer.close();
	} 
		catch (Exception e) 
		{e.printStackTrace();}
		
		
		return mapa;
	}

}
