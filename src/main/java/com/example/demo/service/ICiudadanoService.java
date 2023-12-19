package com.example.demo.service;

import com.example.demo.repository.modelo.Ciudadano;

public interface ICiudadanoService {
	
	public void guardar (Ciudadano ciudadano);
	public Ciudadano buscar (Integer id);

}
