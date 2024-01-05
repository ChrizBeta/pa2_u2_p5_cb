package com.example.demo.service;

import com.example.demo.repository.modelo.Ciudadano;

public interface ICiudadanoService {
	
	public void guardar (Ciudadano ciudadano);
	public Ciudadano buscar (Integer id);
	public void modificar (Ciudadano ciudadano);
	public void borrar (Integer id);

}
