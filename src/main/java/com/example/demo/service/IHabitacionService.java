package com.example.demo.service;

import com.example.demo.repository.modelo.Habitacion;

public interface IHabitacionService {
	
	public Habitacion buscar (Integer id);
	public void guardar (Habitacion habitacion);
	public void modificaar (Habitacion habitacion);
	public void borrar (Integer id);	
	
	public Habitacion buscarPorClase (String clase);

}
