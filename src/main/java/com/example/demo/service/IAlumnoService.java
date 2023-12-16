package com.example.demo.service;

import com.example.demo.repository.modelo.Alumno;

public interface IAlumnoService {
	
	public Alumno buscar (Integer id);
	public void guardar (Alumno estudiante);
	public void modificar (Alumno estudiante);
	public void borrar (Integer id);


}
