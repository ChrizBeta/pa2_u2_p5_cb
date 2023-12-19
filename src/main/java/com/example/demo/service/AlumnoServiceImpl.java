package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IAlumnoRepo;
import com.example.demo.repository.modelo.Alumno;

@Service
public class AlumnoServiceImpl implements IAlumnoService {

	@Autowired
	private IAlumnoRepo alumnoRepo;
	
	@Override
	public Alumno buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.alumnoRepo.seleccionar(id);
	}

	@Override
	public void guardar(Alumno estudiante) {
		// TODO Auto-generated method stub
		this.alumnoRepo.insertar(estudiante);
		
	}

	@Override
	public void modificar(Alumno estudiante) {
		// TODO Auto-generated method stub
		
		
		this.alumnoRepo.actualizar(estudiante);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.alumnoRepo.eliminar(id);
		
		
	}

}
