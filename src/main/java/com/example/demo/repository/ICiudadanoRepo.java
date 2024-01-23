package com.example.demo.repository;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;

public interface ICiudadanoRepo {
	
	public void insertar (Ciudadano ciudadano);
	public Ciudadano seleccionar (Integer id);
	public void actualizar (Ciudadano ciudadano);
	public void eliminar (Integer id);
	
	public Empleado seleccionarPorCedula (String cedula); 
	
	public Ciudadano seleccionarPorCedulaCiu (String cedula);
	
	public Ciudadano seleccionarPorApellido (String apellido);
	
	public Ciudadano selecionarPorApellidoNuevo(String apellido);
	
	public Ciudadano selecionarPorCriteria(String nombre, String apellido, String cedula);
	
	public Ciudadano selecionarPorCriteriaAndOr(String nombre, String apellido, String cedula);
}
