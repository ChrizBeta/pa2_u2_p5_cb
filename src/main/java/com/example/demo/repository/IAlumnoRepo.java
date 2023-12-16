package com.example.demo.repository;

import com.example.demo.repository.modelo.Alumno;

public interface IAlumnoRepo {
	
	public Alumno seleccionar (Integer id);
	public void insertar (Alumno estudiante);
	public void actualizar (Alumno estudiante);
	public void eliminar (Integer id);

}
