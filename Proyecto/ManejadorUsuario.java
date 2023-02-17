package org.jose.controlador;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.jose.clase.*;
import org.jose.controlador.*;
import org.jose.vista.*;
public class ManejadorUsuario{
	static ArrayList<UsuarioCreado> arrayUsuarioCreado=new ArrayList<UsuarioCreado>();
	UsuarioCreado uC=new UsuarioCreado(usuario1,clave1,rol1,id1);
	ObtenerTexto oT=new ObtenerTexto();
	String user;
	String pass;
	String clave;
	String resp;
	int id=0;
	String newuser;
	String newclave;
	String newrol;
	String opcion;
	int cont;
	String resp2;
	int modi;
	int del;
	int resp1;
	String resp4;
	String resp3;
	int opcion2;
	int report;
	String resp5;
	static String usuario1;
	static String clave1;
	static String rol1;
	static int id1;
	public void ingresarUsuario(String usuario1,String clave1,String rol1, int id1){
		do{
				id1++;
				System.out.println("Ingrese El Usuario");
				usuario1=oT.Texto();
				System.out.println("Ingrese La Clave");
				clave1=oT.Texto();
				System.out.println("Ingrese El Rol (a/b)");
				rol1=oT.Texto();				
				System.out.println("Desea Ingresar Otro Usuario?");
				resp=oT.Texto();
				arrayUsuarioCreado.add(new UsuarioCreado(usuario1,clave1,rol1,id1));
			}while(resp.equalsIgnoreCase("si"));
			
	}
	public void verificadorCreados(String us,String clave) throws IOException{
		arrayUsuarioCreado.add(new UsuarioCreado("Jose","corp-car","a",0));//Administrador Predeterminado
		Menu men=new Menu();
		user=uC.getUsuario1();
		pass=uC.getClave1();
		cont=0;
				for(int j=0; j<arrayUsuarioCreado.size(); j++){
			if(us.equals(arrayUsuarioCreado.get(j).getUsuario1())&& clave.equals(arrayUsuarioCreado.get(j).getClave1())){
			if(arrayUsuarioCreado.get(j).getRol1().equalsIgnoreCase("a")){
				System.out.println("Bienvenido Administrador  "+ arrayUsuarioCreado.get(j).getUsuario1());
				System.out.println("************************");
				men.menuAdmin();
			}else{
				System.out.println("Bienvenido Trabajador  "+ arrayUsuarioCreado.get(j).getUsuario1());
				System.out.println("************************");
				men.menuTrabajador();
			}
		}else{
			cont++;
			if(cont==arrayUsuarioCreado.size()){
				System.out.println("Su Usuario O Clave Son Incorrectos");
			}
		}
		}
	}
	
	public void modUsuario(){
	do{
		System.out.println("Ingrese el ID del Cliente Que Desea Modificar");
		modi=oT.Entero();
			for(int j=0; j<arrayUsuarioCreado.size();j++){
				if(modi==arrayUsuarioCreado.get(j).getId1()){
					do{
						System.out.println("Que Desea Modificar?");
						System.out.println("1. Usuario");
						System.out.println("2. Clave");
						System.out.println("3. Rol");
						System.out.println("Elija Que Dato Desea Modificar");
						resp1=oT.Entero();
				switch(resp1){
					case 1:
					System.out.println("Ingrese el Nuevo Usuario");
					newuser=oT.Texto();
					arrayUsuarioCreado.get(j).setUsuario1(newuser);
					break;
					case 2:
						System.out.println("Ingrese La Clave Nueva");
						newclave=oT.Texto();
						arrayUsuarioCreado.get(j).setClave1(newclave);
					break;
					case 3:
						System.out.println("Ingrese El Nuevo Rol");
						newrol=oT.Texto();
						arrayUsuarioCreado.get(j).setRol1(newrol);
					break;
					default:
					System.out.println("Esta Opcion No Es Valida");
					break;
				}
					System.out.println("Desea Modificar Otro Dato");
					resp2=oT.Texto();
					}while(resp2.equalsIgnoreCase("si"));					
				}else{
					cont++;
					if(cont==arrayUsuarioCreado.size()){
					System.out.println("Este ID No Existe");
					}
				}
			}
		System.out.println("Desea Modificar Otro Usuario?");
		opcion=oT.Texto();
		}while(opcion.equalsIgnoreCase("si"));
	}
	public void eliminarUsuario(){
		do{
		System.out.println("Ingrese el ID del Usuario");
		del=oT.Entero();
			for(int j=0;j<arrayUsuarioCreado.size();j++){
				if(del==arrayUsuarioCreado.get(j).getId1()){
					System.out.println("*******************");
			        System.out.println("El Usuario es:");
			       	System.out.println("El Id: "+arrayUsuarioCreado.get(j).getId1());
		            System.out.println("El Usuario: "+arrayUsuarioCreado.get(j).getUsuario1());
		            System.out.println("La Clave: "+arrayUsuarioCreado.get(j).getClave1());
		            System.out.println("El Rol: "+arrayUsuarioCreado.get(j).getRol1());
		            System.out.println("*******************");
					System.out.println("Esta Seguro De Eliminar Al Usuario");
					resp3=oT.Texto();
					if(resp3.equalsIgnoreCase("si")){
						arrayUsuarioCreado.remove(j);
						System.out.println("Usuario Eliminado Correctamente");
					}
				}else{
					cont++;
					if(cont==arrayUsuarioCreado.size()){
						System.out.println("Este ID No Existe");
					}
				}
			}
			System.out.println("Desea Eliminar Otro Usuario?");
			resp4=oT.Texto();
		}while(resp4.equalsIgnoreCase("si"));
	}
	public void Reporte() throws IOException{
		do{
			resp5="no";
		System.out.println("1. Reporte Completo");
		System.out.println("2. Reporte De Un Cliente");
		System.out.println("3. Regresar");
		System.out.println("Elija La Opcion");
		opcion2=oT.Entero();
		switch(opcion2){
			case 1:
			resp5="si";
			String ruta = "h:/Proyecto/reporteUsuarioCompleto.txt";
			File archivo = new File(ruta);
			BufferedWriter bw;
			bw = new BufferedWriter(new FileWriter(archivo));
				for(int j=0;j<arrayUsuarioCreado.size();j++){
					bw.newLine();
					bw.write("*******");
					bw.newLine();
					bw.write("Los Datos Del Usuario  " +arrayUsuarioCreado.get(j).getUsuario1());
					bw.newLine();
					bw.write("El ID es: "+arrayUsuarioCreado.get(j).getId1());
					bw.newLine();
					bw.write("El Usuario es: "+arrayUsuarioCreado.get(j).getUsuario1());
					bw.newLine();
					bw.write("La Clave es: "+arrayUsuarioCreado.get(j).getClave1());
					bw.newLine();
					bw.write("El Rol es: "+arrayUsuarioCreado.get(j).getRol1());
				}
			bw.close();
			System.out.println("Reporte Completo Realizado Correctamente");
			break;
			case 2:
				resp5="si";
				System.out.println("Ingrese El ID Del Usuario ");
				report=oT.Entero();
				String ruta2 = "h:/Proyecto/reporteUsuario.txt";
				File archivo2 = new File(ruta2);
				BufferedWriter bw2;
				bw2 = new BufferedWriter(new FileWriter(archivo2));
				for(int j=0;j<arrayUsuarioCreado.size();j++){
					if(report==arrayUsuarioCreado.get(j).getId1()){
						bw2.write("*******");
						bw2.newLine();
						bw2.write("Los Datos Del Cliente  " +arrayUsuarioCreado.get(j).getUsuario1());
						bw2.newLine();
						bw2.write("El ID es: "+arrayUsuarioCreado.get(j).getId1());
						bw2.newLine();
						bw2.write("El Usuario es: "+arrayUsuarioCreado.get(j).getUsuario1());
						bw2.newLine();
						bw2.write("La Clave es: "+arrayUsuarioCreado.get(j).getClave1());
						bw2.newLine();
						bw2.write("El Rol es: "+arrayUsuarioCreado.get(j).getRol1());
						bw2.newLine();
						bw2.write("*******");
					}else{
						cont++;
						if(cont==arrayUsuarioCreado.size()){
						System.out.println("Este ID No Existe");
						}
					}
				}
				bw2.close();
				System.out.println("Reporte Del Usuario Realizado Correctamente");
			break;	
			case 3:
				resp5="si";
			break;
			default:
			System.out.println("Esta Opcion No Es Valida");
			break;
		
			}
		}while(resp5.equalsIgnoreCase("no"));
	}

}

	
