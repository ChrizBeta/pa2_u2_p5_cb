package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Libro2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LibroRepoImpl2 implements ILibroRepo2 {

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

		// SQL: select * from libro l Where l.lbr_titulo = ?
		// JPQL: select l from Librp l Where l.titulo = :variable

		Query myQuery = this.entityManager.createQuery("select l from Libro2  l Where l.titulo = :variable");
		myQuery.setParameter("variable", nombre);
		return (Libro2) myQuery.getSingleResult();

	}

	@Override
	public List<Libro2> seleccionarPorFechaPublicacion(LocalDate fechaPublicacion) {
		// TODO Auto-generated method stub

		// SQL: Select * from libro2 l where l.lbr_fecha_publicacion >= ?
		// JPQL: Select l from libro2 l where l.fechaPublicacion >= :fecha

		Query myQuery = this.entityManager.createQuery("Select l from Libro2 l where l.fechaPublicacion >= :fecha");
		myQuery.setParameter("fecha", fechaPublicacion);
		return (List<Libro2>) myQuery.getResultList();
	}

	@Override
	public Libro2 seleccionarPorTitulo(String titulo) {

		TypedQuery<Libro2> myQuery = this.entityManager.createQuery("select l from Libro2  l Where l.titulo = :titulo",
				Libro2.class);
		myQuery.setParameter("titulo", titulo);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Libro2> seleccionarPorFecha(LocalDate fechaPublicacion) {
		// TODO Auto-generated method stub
		TypedQuery<Libro2> myQuery = this.entityManager
				.createQuery("Select l from Libro2 l where l.fechaPublicacion >= :fecha", Libro2.class);
		myQuery.setParameter("fecha", fechaPublicacion);
		return myQuery.getResultList();
	}

	@Override
	public Libro2 seleccionarPorNamed(String titulo) {
		// TODO Auto-generated method stub
		TypedQuery<Libro2>myQuery = this.entityManager.createNamedQuery("Libro.queryBuscarPorTitulo",Libro2.class);
		myQuery.setParameter("titulo", titulo);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Libro2> seleccionarPorFechaNamed(LocalDate fechaPublicacion) {
		
		TypedQuery<Libro2>myQuery = this.entityManager.createNamedQuery("Libro.queryBuscarPorFecha",Libro2.class);
		myQuery.setParameter("fechaPublicacion",fechaPublicacion );
		return myQuery.getResultList();
	}

	@Override
	public Libro2 seleccionarPorTituloNative(String titulo) {
		Query myQuery = this.entityManager.createNativeQuery("Select * From libro2 l Where l.lbr_titulo = :lbr_titulo",Libro2.class);
		myQuery.setParameter("lbr_titulo", titulo);
		return (Libro2) myQuery.getSingleResult();
	}

}
