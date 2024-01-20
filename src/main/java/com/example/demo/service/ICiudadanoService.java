package com.example.demo.service;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;

public interface ICiudadanoService {
	
	public void guardar (Ciudadano ciudadano);
	public Ciudadano buscar (Integer id);
	public void modificar (Ciudadano ciudadano);
	public void borrar (Integer id);

	
	public Empleado buscarPorCedula (String cedula); 
	public Ciudadano buscarPorCedulaCiu (String cedula);
	
	public Ciudadano buscarPorApellido (String apellido);
}
