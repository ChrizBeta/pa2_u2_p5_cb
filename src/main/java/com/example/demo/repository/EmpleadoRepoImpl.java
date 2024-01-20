package com.example.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepoImpl implements IEmpleandoRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empleado);
		
	}

	@Override
	public Empleado seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empleado.class, id);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.merge(empleado);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Empleado em=this.seleccionar(id);
		this.entityManager.remove(em);
		
	}

	@Override
	public Empleado seleccionarPorFechaIngreso(LocalDate fechaIngreso) {
		TypedQuery<Empleado> myQuery = this.entityManager.createQuery("select e from Empleado  e Where e.fechaIngreso = :fechaIngreso",Empleado.class);
		myQuery.setParameter("fechaIngreso", fechaIngreso);
		return myQuery.getSingleResult();
	
	}

	@Override
	public Empleado seleccionarPorSalario(BigDecimal salario) {

		Query myQuery= this.entityManager.createNativeQuery("Select * From empleado e Where e.emp_salario = :salario",Empleado.class);
		myQuery.setParameter("salario", salario);
		return (Empleado) myQuery.getSingleResult();
	}
	

}
