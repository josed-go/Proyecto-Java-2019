package org.jose.clase;
public class Vehiculo{
	String placa;
	String marca;
	String model;
	int id;
	String color;
	public Vehiculo(String marca, String model, int id, String color, String placa){
		this.marca=marca;
		this.model=model;
		this.id=id;
		this.color=color;
		this.placa=placa;
	}
	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca){
		this.marca=marca;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model){
		this.model=model;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getPlaca(){
		return placa;
	}
	public void setPlaca(String placa){
		this.placa=placa;
	}


}