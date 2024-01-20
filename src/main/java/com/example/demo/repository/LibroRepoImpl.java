package com.example.demo.repository;

import java.time.LocalDate;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LibroRepoImpl implements ILibroRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}

	@Override
	public Libro seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Libro.class, id);
	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(libro);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Libro libro = this.seleccionar(id);
		this.entityManager.remove(libro);
		
	}

	@Override
	public Libro seleccionarPorFechaPublicacion(LocalDate fechaPublicacion) {
		Query myQuery= this.entityManager.createNativeQuery("Select * From libro l Where l.lbr_fecha_publicacion = :fecha_publicacion",Libro.class);
		myQuery.setParameter("fecha_publicacion", fechaPublicacion);
		return (Libro) myQuery.getSingleResult();
	}

}
