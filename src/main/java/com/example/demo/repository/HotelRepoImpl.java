package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class HotelRepoImpl implements IHotelRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Hotel seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Hotel.class, id);
	}

	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
		
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		
		
		
		this.entityManager.merge(hotel);
		
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Hotel hotel = this.seleccionar(id);
		this.entityManager.remove(hotel);
		
	}

	@Override
	public Hotel seleccionarPorDireccion(String direccion) {
		Query myQuery= this.entityManager.createNativeQuery("Select * From hotel h Where h.htl_direccion = :direccion",Hotel.class);
		myQuery.setParameter("direccion", direccion);
		return (Hotel) myQuery.getSingleResult();
	}
	

}
