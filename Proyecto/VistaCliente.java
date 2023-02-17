package org.jose.vista;
import java.io.IOException;
import org.jose.clase.*;
import org.jose.controlador.*;
public class VistaCliente{
	ObtenerTexto oT=new ObtenerTexto();
	UsuarioCreado uC=new UsuarioCreado();
	ManejadorCliente mC=new ManejadorCliente();
	String apellido;
	int id=0;
	String nombre;
	String car;
	String telefono;
	String resp1;
	public void menuClienteAdm() throws IOException{
		int opc;
		Menu menu=new Menu();
		do{
			resp1="no";
			System.out.println("Administrador  "  +uC.getUsuario1()+  "  Elijio Cliente");
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
					mC.ingresarCliente(id,nombre,apellido,telefono,car);
				break;
				case 2:
					mC.modCliente();
				break;
				case 3:
					mC.eliminarCliente();
				break;
				case 4:
					mC.Reporte();
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
	public void menuClienteTrab() throws IOException{
		int opc;
		Menu menu=new Menu();
		do{
			resp1="no";
			System.out.println("Trabajador Elijio Cliente");
			System.out.println("************************");
			System.out.println("1. Ingresar");
			System.out.println("2. Reporte");
			System.out.println("3. Regresar");
			System.out.println("Administrador Elija Una Opcion");
			opc=oT.Entero();
			switch(opc){
				case 1:
					mC.ingresarCliente(id,nombre,apellido,telefono,car);
				break;
				case 2:
					mC.Reporte();
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