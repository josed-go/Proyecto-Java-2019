package org.jose.clase;
public class UsuarioCreado{
	String usuario1;
	String clave1;
	String rol1;
	int id1=1;
	String rol;
	public UsuarioCreado(){
		usuario1="Jose";
		clave1="corp-car";
		rol="a";
	}
	public UsuarioCreado(String usuario1, String clave1, String rol1, int id1){
		this.usuario1=usuario1;
		this.clave1=clave1;
		this.rol1=rol1;
		this.id1=id1;
	}
	public String getUsuario1(){
		return usuario1;
	}
	public String getClave1(){
		return clave1;
	}
	public String getRol1(){
		return rol1;
	}
	public void setUsuario1(String usuario1){
		this.usuario1=usuario1;
	}
	public void setClave1(String clave1){
		this.clave1=clave1;
	}
	public void setRol1(String rol1){ 
		this.rol1=rol1;
	}
	public int getId1(){
		return id1;
	}
	public void setId1(int id1){ 
		this.id1=id1;
	}
	public String getRol(){
		return rol;
	}
	public void setRol(String rol){
		this.rol=rol;
	}
}