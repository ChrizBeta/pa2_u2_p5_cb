package com.example.demo.repository;

import com.example.demo.repository.modelo.Ciudadano;

public interface ICiudadanoRepo {
	
	public void insertar (Ciudadano ciudadano);
	public Ciudadano seleccionar (Integer id);
	public void actualizar (Ciudadano ciudadano);
	public void eliminar (Integer id);
	
}
