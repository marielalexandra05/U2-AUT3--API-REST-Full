package com.ista.backend.apirest.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;


@Entity
@Getter 
@Setter

public class Usuario implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "apellido", length = 100)
    private String apellido;

    @Column(name = "clave", length = 100, nullable = false, unique = true)
    private String clave;
    
    @Column(name = "email", length = 200, nullable = false, unique = true)
    private String email;

    @Column(name = "estado")
    private String estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
    
    
    

}
