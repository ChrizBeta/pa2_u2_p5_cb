package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEmpleandoRepo;
import com.example.demo.repository.modelo.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
	@Autowired
	private IEmpleandoRepo empleandoRepo;

	@Override
	public void guardar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleandoRepo.insertar(empleado);
		
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.empleandoRepo.seleccionar(id);
	}

	@Override
	public void modificar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleandoRepo.actualizar(empleado);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.empleandoRepo.eliminar(id);
		
	}
	

}
