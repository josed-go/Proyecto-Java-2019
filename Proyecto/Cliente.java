package org.jose.clase;
public class Cliente{
	String nombre;
	String apellido;
	String telefono;
	int id;
	String car;
	public Cliente(int id, String nombre, String apellido , String telefono, String car){
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
		this.id=id;
		this.car=car;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getNombre(){
		
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	public String getTelefono(){
		return telefono;
	}
	public void setTelefono(String telefono){
		this.telefono=telefono;
	}

	public String getCar(){
		return car;
	}
	public void setCar(String car){
		this.car=car;
	}
}
