package com.example.demo.service;

import java.time.LocalDate;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteService {
	
	public Estudiante buscar (Integer id);
	public void guardar (Estudiante estudiante);
	public void modificar (Estudiante estudiante);
	public void borrar (Integer id);

	
	public Estudiante buscarPorFechaNacimiento (LocalDate fechaNacimiento);
}
