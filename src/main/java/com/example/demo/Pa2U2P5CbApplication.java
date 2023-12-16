package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IAlumnoService;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P5CbApplication implements CommandLineRunner {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IAlumnoService alumnoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5CbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		Estudiante estu = new Estudiante();
		estu.setNombre("Christian");
		estu.setApellido("Betancourt");
		estu.setCedula("1722781000");
		estu.setFechaNacimiento(LocalDate.of(2000,5,15));
		this.estudianteService.guardar(estu);		
		estu.setNombre("Betancourt");		
		//this.estudianteService.modificar(estu);		
		//this.estudianteService.buscar(1);		
		//this.estudianteService.borrar(1);
		*/
		
		Alumno alum = new Alumno();
		alum.setNombre("Christian");
		//this.alumnoService.guardar(alum);
		
		Alumno alu1 = this.alumnoService.buscar(1);
		alu1.setNombre("Alejandro");
		this.alumnoService.modificar(alu1);
		
		
		
		
		
	}

}
