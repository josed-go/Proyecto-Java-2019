package org.jose.vista;
import org.jose.clase.*;
import org.jose.controlador.*;
import java.io.IOException;
public class VistaVehiculo{
	ObtenerTexto oT=new ObtenerTexto();
	UsuarioCreado uC=new UsuarioCreado();
	ManejadorVehiculo mV=new ManejadorVehiculo();
		int id=0;
		String marca;
		String model;
		String color;
		String placa;
		String resp1;
	public void menuVehiculoAdm() throws IOException{
		int opc;
		Menu menu=new Menu();
		do{
			resp1="no";
			System.out.println("Administrador  "  +uC.getUsuario1()+  "  Elijio Vehiculo");
			System.out.println("************************");
			System.out.println("1. Ingresar");
			System.out.println("2. Modificar");
			System.out.println("3. Eliminar");
			System.out.println("4. Reporte");
			System.out.println("5. Regresar");
			System.out.println("Administrador  "  +uC.getUsuario1()+ "  Elija Una Opcion");
			opc=oT.Entero();
			switch(opc){
				case 1:
					mV.ingresarVehiculo(marca,model,id,color,placa);
				break;
				case 2:
					mV.modVehiculo();
				break;
				case 3:
					mV.eliminarVehiculo();
				break;
				case 4:
					mV.reporteVehiculo();
				break;
				case 5:
					resp1="si";
					menu.menuAdmin();
				break;
				default:
				System.out.println("Esta Opcion No Es Valida");
			}
		}while(resp1.equalsIgnoreCase("no"));
	}
	public void menuVehiculoTrab() throws IOException{
		int opc;
		Menu menu=new Menu();
		do{
			resp1="no";
			System.out.println("Administrador Elijio Vehiculo");
			System.out.println("************************");
			System.out.println("1. Ingresar");
			System.out.println("2. Reporte");
			System.out.println("3. Regresar");
			System.out.println("Trabajador Elija Una Opcion");
			opc=oT.Entero();
			switch(opc){
				case 1:
					mV.ingresarVehiculo(marca,model,id,color,placa);
				break;
				case 2:
					mV.reporteVehiculo();
				break;
				case 3:
					resp1="si";
					menu.menuTrabajador();
				break;
				default:
				System.out.println("Esta Opcion No Es Valida");
			}
		}while(resp1.equalsIgnoreCase("no"));
	}
}