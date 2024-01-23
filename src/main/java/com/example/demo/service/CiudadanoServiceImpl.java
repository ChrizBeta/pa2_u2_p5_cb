package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICiudadanoRepo;
import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService{
	
	@Autowired
	private ICiudadanoRepo ciudadanoRepo;

	@Override
	public void guardar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.insertar(ciudadano);
		
	}

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.seleccionar(id);
	}

	@Override
	public void modificar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.actualizar(ciudadano);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.eliminar(id);
		
	}

	@Override
	public Empleado buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.seleccionarPorCedula(cedula);
	}

	@Override
	public Ciudadano buscarPorCedulaCiu(String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.seleccionarPorCedulaCiu(cedula);
	}

	@Override
	public Ciudadano buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.seleccionarPorApellido(apellido);
	}

	@Override
	public Ciudadano buscarPorApellidoNuevo(String apellido) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.selecionarPorApellidoNuevo(apellido);
	}

	@Override
	public Ciudadano buscarPorCriteria(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.selecionarPorCriteria(nombre, apellido, cedula);
	}

	@Override
	public Ciudadano buscarPorCriteriaAndOr(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.selecionarPorCriteriaAndOr(nombre, apellido, cedula);
	}
	
	

}
