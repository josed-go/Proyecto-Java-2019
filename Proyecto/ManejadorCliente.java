package org.jose.controlador;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.jose.clase.*;
import org.jose.controlador.*;
public class ManejadorCliente{
	static ArrayList<Cliente> arrayCliente=new ArrayList<Cliente>();
	ObtenerTexto oT=new ObtenerTexto();
		String apellido;
		int id=0;
		String nombre;
		String car;
		String telefono;
		String resp;
		int modi;
		String opcion;
		int resp1;
		String newname;
		String resp2;
		String newapell;
		String newtel;
		String newcar;
		int del;
		String resp3;
		String resp4;
		int report;
		int opcion2;
		int cont;
		String resp5;
	public void ingresarCliente(int id,String nombre,String apellido, String telefono, String car){
			do{
				id++;
				System.out.println("Ingrese El Nombre");
				nombre=oT.Texto();
				System.out.println("Ingrese El Apellido");
				apellido=oT.Texto();
				System.out.println("Ingrese El Numero De Telefono");
				telefono=oT.Texto();
				System.out.println("Ingrese El Vehiculo");
				car=oT.Texto();					
				System.out.println("Desea Ingresar Otro Cliente?");
				resp=oT.Texto();
				arrayCliente.add(new Cliente(id,nombre,apellido,telefono,car));
			}while(resp.equalsIgnoreCase("si"));
			
	}
	public void modCliente(){
	do{
		System.out.println("Ingrese el ID del Cliente Que Desea Modificar");
		modi=oT.Entero();
			for(int j=0; j<arrayCliente.size();j++){
				if(modi==arrayCliente.get(j).getId()){
					do{
				System.out.println("Que Desea Modificar?");
				System.out.println("1. Nombre");
				System.out.println("2. Apellido");
				System.out.println("3. Telefono");
				System.out.println("4. Vehiculo");
				System.out.println("Elija Que Dato Desea Modificar");
				resp1=oT.Entero();
				switch(resp1){
					case 1:
					System.out.println("Ingrese el Nuevo Nombre");
					newname=oT.Texto();
					arrayCliente.get(j).setNombre(newname);
					break;
					case 2:
						System.out.println("Ingrese el Nuevo Apellido");
						newapell=oT.Texto();
						arrayCliente.get(j).setApellido(newapell);
					break;
					case 3:
						System.out.println("Ingrese el Nuevo  Numero de Telefono");
						newtel=oT.Texto();
						arrayCliente.get(j).setTelefono(newtel);
					break;
					case 4:
						System.out.println("Ingrese el Nuevo Vehiculo");
						newcar=oT.Texto();
						arrayCliente.get(j).setCar(newcar);
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
					if(cont==arrayCliente.size()){
					System.out.println("Este ID No Existe");
					}
				}
			}
		System.out.println("Desea Modificar Otro Cliente?");
		opcion=oT.Texto();
		}while(opcion.equalsIgnoreCase("si"));
	}
	public void eliminarCliente(){
		do{
		System.out.println("Ingrese el ID del Cliente");
		del=oT.Entero();
			for(int j=0;j<arrayCliente.size();j++){
				if(del==arrayCliente.get(j).getId()){
					System.out.println("*******************");
			        System.out.println("El Cliente es:");
			       	System.out.println("El Id: "+arrayCliente.get(j).getId());
		            System.out.println("El Nombre: "+arrayCliente.get(j).getNombre());
		            System.out.println("El Apellido: "+arrayCliente.get(j).getApellido());
		            System.out.println("El Telefono: "+arrayCliente.get(j).getTelefono());
		            System.out.println("El Vehiculo: "+arrayCliente.get(j).getCar());
		            System.out.println("*******************");
					System.out.println("Esta Seguro De Eliminar Al Cliente");
					resp3=oT.Texto();
					if(resp3.equalsIgnoreCase("si")){
						arrayCliente.remove(j);
						System.out.println("Cliente Eliminado Correctamente");
					}
				}else{
					cont++;
					if(cont==arrayCliente.size()){
						System.out.println("Este ID No Existe");
					}
				}
			}
		
			System.out.println("Desea Eliminar Otro Cliente?");
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
			String ruta = "h:/Proyecto/reporteCompleto.txt";
			File archivo = new File(ruta);
			BufferedWriter bw;
			bw = new BufferedWriter(new FileWriter(archivo));
				for(int j=0;j<arrayCliente.size();j++){
					bw.newLine();
					bw.write("*******");
					bw.newLine();
					bw.write("Los Datos Del Cliente  " +arrayCliente.get(j).getNombre());
					bw.newLine();
					bw.write("El ID es: "+arrayCliente.get(j).getId());
					bw.newLine();
					bw.write("El Nombre es: "+arrayCliente.get(j).getNombre());
					bw.newLine();
					bw.write("El Apellido es: "+arrayCliente.get(j).getApellido());
					bw.newLine();
					bw.write("El Numero de Telefono: "+arrayCliente.get(j).getTelefono());
					bw.newLine();
					bw.write("El Vehiculo: "+arrayCliente.get(j).getCar());
				}
			bw.close();
			System.out.println("Reporte Completo Realizado Correctamente");
			break;
			case 2:
				resp5="si";
				System.out.println("Ingrese El ID Del Cliente ");
				report=oT.Entero();
				String ruta2 = "h:/Proyecto/reporteCliente.txt";
				File archivo2 = new File(ruta2);
				BufferedWriter bw2;
				bw2 = new BufferedWriter(new FileWriter(archivo2));
				for(int j=0;j<arrayCliente.size();j++){
					if(report==arrayCliente.get(j).getId()){
						bw2.write("*******");
						bw2.newLine();
						bw2.write("Los Datos Del Cliente  " +arrayCliente.get(j).getNombre());
						bw2.newLine();
						bw2.write("El ID es: "+arrayCliente.get(j).getId());
						bw2.newLine();
						bw2.write("El Nombre es: "+arrayCliente.get(j).getNombre());
						bw2.newLine();
						bw2.write("El Apellido es: "+arrayCliente.get(j).getApellido());
						bw2.newLine();
						bw2.write("El Numero de Telefono: "+arrayCliente.get(j).getTelefono());
						bw2.newLine();
						bw2.write("El Vehiculo: "+arrayCliente.get(j).getCar());
						bw2.newLine();
						bw2.write("*******");
					}else{
						cont++;
						if(cont==arrayCliente.size()){
						System.out.println("Este ID No Existe");
						}
					}
				}
				bw2.close();
				System.out.println("Reporte Del Cliente Realizado Correctamente");
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
