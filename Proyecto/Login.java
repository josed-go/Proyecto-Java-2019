package org.jose.vista;
import java.io.IOException;
import org.jose.clase.*;
import org.jose.controlador.*;
public class Login{
		ObtenerTexto oT=new ObtenerTexto();
		ManejadorUsuario mU=new ManejadorUsuario();
		String usuario;
		String clave;
		String rol1;
		char rol;
		int cont;
	public void pantallaInicio() throws IOException{
		while(cont<3){
		System.out.println("****************** Pantalla De Login ******************");
		System.out.println("Ingrese Su Usuario");
		usuario=oT.Texto();
		System.out.println("Ingrese Su Clave");
		clave=oT.Texto();
		mU.verificadorCreados(usuario,clave);
		}
	}

}