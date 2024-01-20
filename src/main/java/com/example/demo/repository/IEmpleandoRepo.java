package com.example.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.demo.repository.modelo.Empleado;

public interface IEmpleandoRepo {
	
	public void insertar (Empleado empleado);	
	public Empleado seleccionar (Integer id);	
	public void actualizar (Empleado empleado);
	public void eliminar (Integer id);
	
	public Empleado seleccionarPorFechaIngreso (LocalDate fechaIngreso);
	public Empleado seleccionarPorSalario (BigDecimal salario);

}
