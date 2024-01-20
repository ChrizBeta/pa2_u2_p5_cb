package com.example.demo.repository;

import java.time.LocalDate;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepo {
	
	public Estudiante seleccionar (Integer id);
	public void insertar (Estudiante estudiante);
	public void actualizar (Estudiante estudiante);
	public void eliminar (Integer id);
	
	public Estudiante seleccionarPorFechaNacimiento (LocalDate fechaNacimiento);
	

}
