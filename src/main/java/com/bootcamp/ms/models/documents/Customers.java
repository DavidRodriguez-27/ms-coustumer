package com.bootcamp.ms.models.documents;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection="customers")
public class Customers {
	
	@Id
	private String id;
	
	@NotEmpty
	public String nombres;
	
	@NotEmpty
	public String apellidos;
	
	@NotEmpty
	public String tipoCliente;
	
	@NotNull
	public String DNI;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createAt;
	
	
	public Customers() {}

	public Customers(String nombres, String apellidos, String DNI, String tipoCliente) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.DNI = DNI;
		this.tipoCliente = tipoCliente;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombre) {
		this.nombres = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	

}
