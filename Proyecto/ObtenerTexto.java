package org.jose.controlador;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ObtenerTexto{
	BufferedReader lr= new BufferedReader(new InputStreamReader(System.in));
	public String Texto(){
		String texto=null;
		try{
			texto=lr.readLine();
		}catch(IOException ioe){
		System.out.println("Error");
			System.exit(1);
		}
		return texto;
	}
	public int Entero(){
		int texto=0;
		try{
			texto=Integer.parseInt(lr.readLine());
		}catch(IOException ioe){
			System.out.println("Error");
			System.exit(1);
		}
		return texto;
	}
}