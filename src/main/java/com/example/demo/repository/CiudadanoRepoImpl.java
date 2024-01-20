package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadanoRepoImpl implements ICiudadanoRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method 
		this.entityManager.persist(ciudadano);	
		
	}

	@Override
	public Ciudadano seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ciudadano.class, id);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.entityManager.merge(ciudadano);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Ciudadano ciu = this.seleccionar(id);
		this.entityManager.remove(ciu);
		
	}

	@Override
	public Empleado seleccionarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Empleado>myQuery = this.entityManager.createQuery("Select e From Empleado e Where e.ciudadano.cedula = :cedula",Empleado.class);
		myQuery.setParameter("cedula", cedula);
		
		return myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorCedulaCiu(String cedula) {
		// TODO Auto-generated method stub
		
		Query myQuery= this.entityManager.createNativeQuery("Select * From ciudadano c Where c.ciu_ced = :cedula",Ciudadano.class);
		myQuery.setParameter("cedula", cedula);
		return (Ciudadano) myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorApellido(String apellido) {
		TypedQuery<Ciudadano> myQuery = this.entityManager.createQuery("select c from Ciudadano c Where c.apellido = :apellido",Ciudadano.class);
		myQuery.setParameter("apellido", apellido);
		return myQuery.getSingleResult();
	
	}
	
	

}
