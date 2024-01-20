package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutorRepoImpl implements IAutorRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Autor autor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(autor);
		
	}

	@Override
	public Autor seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Autor.class, id);
	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(autor);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Autor autor = this.seleccionar(id);
		this.entityManager.remove(autor);
		
	}

	@Override
	public Autor seleccionarPorNacionalidad(String nacionalidad) {
		TypedQuery<Autor> myQuery = this.entityManager.createQuery("select a from Autor  a Where a.nacionalidad = :nacionalidad",Autor.class);
		myQuery.setParameter("nacionalidad", nacionalidad);
		return myQuery.getSingleResult();
	
	}

}
