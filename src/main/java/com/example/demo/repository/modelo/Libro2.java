package com.example.demo.repository.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro2")
@NamedQuery(name = "Libro.queryBuscarPorTitulo",query = "select l from Libro2  l Where l.titulo = :titulo")
@NamedQuery(name = "Libro.queryBuscarPorFecha",query="Select l from Libro2 l where l.fechaPublicacion >= :fechaPublicacion")
public class Libro2 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_libro2")
	@SequenceGenerator(name = "seq_libro2", sequenceName = "seq_libro2", allocationSize = 1)
	@Column(name = "lbr_id")
	private Integer id;
	@Column(name = "lbr_titulo")
	private String titulo;
	@Column(name = "lbr_fecha_publicacion")
	private LocalDate fechaPublicacion;

	@OneToMany (mappedBy = "libro2",cascade = CascadeType.ALL)
	private List<AutorLibro> autoreslibros;
	

	// GET Y SET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public List<AutorLibro> getAutoreslibros() {
		return autoreslibros;
	}

	public void setAutoreslibros(List<AutorLibro> autoreslibros) {
		this.autoreslibros = autoreslibros;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", fechaPublicacion=" + fechaPublicacion + "]";
	}

}


