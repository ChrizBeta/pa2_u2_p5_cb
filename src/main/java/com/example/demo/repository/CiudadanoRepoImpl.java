package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadanoRepoImpl implements ICiudadanoRepo {

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
		TypedQuery<Empleado> myQuery = this.entityManager
				.createQuery("Select e From Empleado e Where e.ciudadano.cedula = :cedula", Empleado.class);
		myQuery.setParameter("cedula", cedula);

		return myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorCedulaCiu(String cedula) {
		// TODO Auto-generated method stub

		Query myQuery = this.entityManager.createNativeQuery("Select * From ciudadano c Where c.ciu_ced = :cedula",
				Ciudadano.class);
		myQuery.setParameter("cedula", cedula);
		return (Ciudadano) myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorApellido(String apellido) {
		TypedQuery<Ciudadano> myQuery = this.entityManager
				.createQuery("select c from Ciudadano c Where c.apellido = :apellido", Ciudadano.class);
		myQuery.setParameter("apellido", apellido);
		return myQuery.getSingleResult();

	}

	@Override
	public Ciudadano selecionarPorApellidoNuevo(String apellido) {
		// Paso 0: Creamos una instancia de la interfaz CriteriaBuilder a partir
		// de un entity manager
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		// Paso 1: Determinamos el tipo de retorno que va ha tener mi consulta
		CriteriaQuery<Ciudadano> myCriteriaQuery = myCriteria.createQuery(Ciudadano.class);

		// Paso 2: Construir nuestro SQL
		// 2.1: Determinar el From se lo usa mediante una interfaaz conocida como root
		// NOTA: No necesariamente el from es igual al tipo de retorno
		// Select From Coiudadano c Where c.nombre = :dato
		Root<Ciudadano> myTablaFrom = myCriteriaQuery.from(Ciudadano.class);

		// 2.2:Construir las condiciones WHere del SQL
		// En Criteri Api Query las condiciones se las conoce como predicate
		Predicate condicionApellido = myCriteria.equal(myTablaFrom.get("apellido"), apellido);

		// Paso 3: Construimos el SQL final
		myCriteriaQuery.select(myTablaFrom).where(condicionApellido);

		// Paso 4: Ejecutamos la consulta con un TypedQuery
		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Ciudadano selecionarPorCriteria(String nombre, String apellido, String cedula) {

		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Ciudadano> myCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);

		Root<Ciudadano> myFrom = myCriteriaQuery.from(Ciudadano.class);

		Predicate condicionGenerica = null;
		
		if (cedula.startsWith("17")) {
			condicionGenerica= myCriteriaBuilder.equal(myFrom.get("nombre"), nombre);
		} else if (cedula.startsWith("05")) {
			condicionGenerica = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);
		} else {
			condicionGenerica = myCriteriaBuilder.equal(myFrom.get("cedula"), cedula);
		}

		myCriteriaQuery.select(myFrom).where(condicionGenerica);
		
		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();

	}

	@Override
	public Ciudadano selecionarPorCriteriaAndOr(String nombre, String apellido, String cedula) {

		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Ciudadano> myCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);

		Root<Ciudadano> myFrom = myCriteriaQuery.from(Ciudadano.class);

		Predicate condicionTotal = null;
		
		Predicate condicionNombre = myCriteriaBuilder.equal(myFrom.get("nombre"), nombre);
		
		Predicate condicionApellido = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);
		
		if (cedula.startsWith("17")) {
			condicionTotal = myCriteriaBuilder.or(condicionNombre,condicionApellido);
		} else if (cedula.startsWith("05")) {
			condicionTotal = myCriteriaBuilder.and(condicionNombre,condicionApellido);
		} 

		myCriteriaQuery.select(myFrom).where(condicionTotal);
		
		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();

	}

}
