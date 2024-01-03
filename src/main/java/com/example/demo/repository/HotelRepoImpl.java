package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
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
		this.entityManager.remove(id);
		
	}
	

}
