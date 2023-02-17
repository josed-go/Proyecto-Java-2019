package org.jose.controlador;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.jose.clase.*;
import org.jose.controlador.*;
public class ManejadorVehiculo{
	static ArrayList<Vehiculo> arrayVehiculo=new ArrayList<Vehiculo>();
	ObtenerTexto oT=new ObtenerTexto();
	String marca;
	String model;
	int id=0;
	String color;
	String placa;
	String resp;
	int modi;
	int resp1;
	String resp2;
	String newmarca;
	String newmodel;
	String newcolor;
	String newplaca;
	String opcion;
	int del;
	String resp3;
	String resp4;
	int report;
	int opcion2;
	int cont;
	String resp5;
	public void ingresarVehiculo(String marca, String model, int id, String color, String placa){
			do{
				id++;
				System.out.println("Ingrese La Marca Del Vehiculo");
				marca=oT.Texto();
				System.out.println("Ingrese El Modelo Del Vehiculo");
				model=oT.Texto();
				System.out.println("Ingrese El Color Del Vehiculo");
				color=oT.Texto();
				System.out.println("Ingrese La Placa Del Vehiculo");
				placa=oT.Texto();					
				System.out.println("Desea Ingresar Otro Vehiculo?");
				resp=oT.Texto();
				arrayVehiculo.add(new Vehiculo(marca,model,id,color,placa));
			}while(resp.equalsIgnoreCase("si"));
			
	}
	public void modVehiculo(){
	do{
		System.out.println("Ingrese el ID del Vehiculo Que Desea Modificar");
		modi=oT.Entero();
			for(int j=0; j<arrayVehiculo.size();j++){
				if(modi==arrayVehiculo.get(j).getId()){
					do{
						System.out.println("Que Desea Modificar?");
						System.out.println("1. Marca");
						System.out.println("2. Modelo");
						System.out.println("3. Color");
						System.out.println("4. Placa");
						System.out.println("Elija Que Dato Desea Modificar");
						resp1=oT.Entero();
				switch(resp1){
					case 1:
					System.out.println("Ingrese La Nueva Marca Del Vehiculo");
					newmarca=oT.Texto();
					arrayVehiculo.get(j).setMarca(newmarca);
					break;
					case 2:
						System.out.println("Ingrese El Nuevo Modelo Del Vehiculo");
						newmodel=oT.Texto();
						arrayVehiculo.get(j).setModel(newmodel);
					break;
					case 3:
						System.out.println("Ingrese El Nuevo Color Del Vehiculo");
						newcolor=oT.Texto();
						arrayVehiculo.get(j).setColor(newcolor);
					break;
					case 4:
						System.out.println("Ingrese La Nueva Placa Del Vehiculo");
						newplaca=oT.Texto();
						arrayVehiculo.get(j).setPlaca(newplaca);
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
					if(cont==arrayVehiculo.size()){
					System.out.println("Este ID No Existe");
					}
				}
			}
		System.out.println("Desea Modificar Otro Vehiculo?");
		opcion=oT.Texto();
		}while(opcion.equalsIgnoreCase("si"));
	}
	public void eliminarVehiculo(){
		do{
		System.out.println("Ingrese el ID del Vehiculo");
		del=oT.Entero();
			for(int j=0;j<arrayVehiculo.size();j++){
				if(del==arrayVehiculo.get(j).getId()){
					System.out.println("*******************");
			        System.out.println("El Vehiculo es:");
			       	System.out.println("El Id es : " +arrayVehiculo.get(j).getId());
		            System.out.println("La Marca es: " +arrayVehiculo.get(j).getMarca());
		            System.out.println("El Modelo es: " +arrayVehiculo.get(j).getModel());
		            System.out.println("El Color es: " +arrayVehiculo.get(j).getColor());
		            System.out.println("La Placa es: " +arrayVehiculo.get(j).getPlaca());
		            System.out.println("*******************");
					System.out.println("Esta Seguro De Eliminar El Vehiculo");
					resp3=oT.Texto();
					if(resp3.equalsIgnoreCase("si")){
						arrayVehiculo.remove(j);
						System.out.println("Vehiculo Eliminado Correctamente");
					}
				}else{
					cont++;
					if(cont==arrayVehiculo.size()){
						System.out.println("Este ID No Existe");
					}
				}
			}
			System.out.println("Desea Eliminar Otro Vehiculo?");
			resp4=oT.Texto();
		}while(resp4.equalsIgnoreCase("si"));
	}
	public void reporteVehiculo() throws IOException{
		do{
			resp5="no";
		System.out.println("1. Reporte Completo");
		System.out.println("2. Reporte De Un Vehiculo");
		System.out.println("3. Regresar");
		System.out.println("Elija La Opcion");
		opcion2=oT.Entero();
		switch(opcion2){
			case 1:
			String ruta = "h:/Proyecto/reporteVehiculoCompleto.txt";
			File archivo = new File(ruta);
			BufferedWriter bw;
			bw = new BufferedWriter(new FileWriter(archivo));
				for(Vehiculo variable: arrayVehiculo){
					bw.newLine();
					bw.write("*******");
					bw.newLine();
					bw.write("Los Datos Del Vehiculo Marca " +variable.getMarca()+ " Y Placa " +variable.getPlaca());
					bw.newLine();
					bw.write("El ID es: " +variable.getId());
					bw.newLine();
					bw.write("La Marca es: " +variable.getMarca());
					bw.newLine();
					bw.write("El Modelo es: " +variable.getModel());
					bw.newLine();
					bw.write("El Color es: " +variable.getColor());
					bw.newLine();
					bw.write("La Placa es: " +variable.getPlaca());
				}
			bw.close();
			System.out.println("Reporte Completo Realizado Correctamente");
			break;
			case 2:
				System.out.println("Ingrese El ID Del Vehiculo ");
				report=oT.Entero();
				String ruta2 = "h:/Proyecto/reporteVehiculo.txt";
				File archivo2 = new File(ruta2);
				BufferedWriter bw2;
				bw2 = new BufferedWriter(new FileWriter(archivo2));
				for(int j=0;j<arrayVehiculo.size();j++){
					if(report==arrayVehiculo.get(j).getId()){
						bw2.write("Los Datos Del Vehiculo Marca " +arrayVehiculo.get(j).getMarca()+ " Y Placa " +arrayVehiculo.get(j).getPlaca());
						bw2.newLine();
						bw2.write("El ID es: "+arrayVehiculo.get(j).getId());
						bw2.newLine();
						bw2.write("La Marca es: "+arrayVehiculo.get(j).getMarca());
						bw2.newLine();
						bw2.write("El Modelo es: "+arrayVehiculo.get(j).getModel());
						bw2.newLine();
						bw2.write("El Color es: "+arrayVehiculo.get(j).getColor());					
						bw2.newLine();
						bw2.write("La Placa es: "+arrayVehiculo.get(j).getPlaca());		
					}else{
						cont++;
						if(cont==arrayVehiculo.size()){
						System.out.println("Este ID No Existe");
						}
					}
				}
				bw2.close();
			System.out.println("Reporte Del Vehiculo Realizado Correctamente");
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