package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AlumnoRepoImpl implements IAlumnoRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Alumno seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Alumno.class, id);
	}

	@Override
	public void insertar(Alumno estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public void actualizar(Alumno estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.seleccionar(id));
	}

	@Override
	public Alumno seleccionarPorNombre(String nombre) {
		TypedQuery<Alumno> myQuery = this.entityManager.createQuery("select a from Alumno  a Where a.nombre = :nombre",Alumno.class);
		myQuery.setParameter("nombre", nombre);
		return myQuery.getSingleResult();	
	}

}
