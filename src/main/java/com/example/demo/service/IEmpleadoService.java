package com.example.demo.service;

import com.example.demo.repository.modelo.Empleado;

public interface IEmpleadoService {
	
	public void guardar (Empleado empleado);	
	public Empleado buscar (Integer id);	
	public void modificar (Empleado empleado);
	public void borrar (Integer id);

}
