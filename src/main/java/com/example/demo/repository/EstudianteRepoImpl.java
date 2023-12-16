package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Estudiante seleccionar(Integer id) {		
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(this.seleccionar(id));		
	}
	

	
	
}
