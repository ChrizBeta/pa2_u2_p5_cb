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
	

}
