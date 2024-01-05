package com.example.demo.repository;

import com.example.demo.repository.modelo.Habitacion;

public interface IHabitacionRepo {
	
	public Habitacion seleccionar (Integer id);
	public void insertar (Habitacion habitacion);
	public void actualizar (Habitacion habitacion);
	public void eliminar (Integer id);	

}
