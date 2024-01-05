package com.example.demo.repository;

import com.example.demo.repository.modelo.Empleado;

public interface IEmpleandoRepo {
	
	public void insertar (Empleado empleado);	
	public Empleado seleccionar (Integer id);	
	public void actualizar (Empleado empleado);
	public void eliminar (Integer id);

}
