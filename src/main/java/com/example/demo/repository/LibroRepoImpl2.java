package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Libro2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LibroRepoImpl2 implements ILibroRepo2{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Libro2 libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
		
	}

	@Override
	public Libro2 seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Libro2.class, id);
	}

	@Override
	public void actualizar(Libro2 libro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(libro);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Libro2 libro = this.seleccionar(id);
		this.entityManager.remove(libro);
		
	}

	@Override
	public Libro2 seleccionarPorNombre(String nombre) {
		
		//SQL: select * from libro l Where l.lbr_titulo = ?
		//JPQL: select l from Librp  l Where l.titulo = :variable
		
		Query myQuery = this.entityManager.createQuery("select l from Libro  l Where l.titulo = :variable");
		myQuery.setParameter("variable", nombre);
		return (Libro2) myQuery.getSingleResult();
		
		
	}

	
}
