package ar.com.unpaz.service;

import java.util.HashMap;

import ar.com.unpaz.model.Facturas;

public interface IServiceLeerArchivo {

	public HashMap<Integer, Facturas> Lectura();
}
