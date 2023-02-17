package org.jose.vista;
import java.io.IOException;
import org.jose.clase.*;
import org.jose.controlador.*;
public class Menu{
	ObtenerTexto oT=new ObtenerTexto();
	UsuarioCreado uC=new UsuarioCreado();
	VistaCliente vC=new VistaCliente();
	VistaVehiculo vV=new VistaVehiculo();
	VistaUsuario vU=new VistaUsuario();
	Login login=new Login();
	String resp;
	int opcion;
	public void menuAdmin() throws IOException{
		do{
			resp="no";
			System.out.println("Bienvenido Al Menu Principal Administrador "  +uC.getUsuario1());
			System.out.println("************************");
			System.out.println("1. Cliente");
			System.out.println("************************");
			System.out.println("2. Vehiculo");
			System.out.println("************************");
			System.out.println("3. Usuario");
			System.out.println("************************");
			System.out.println("4. Cerrar Sesion");
			System.out.println("************************");
			System.out.println("5. Salir");
			System.out.println("************************");
			System.out.println("Administrador  Elija Una Opcion");
			System.out.println("************************");
			opcion=oT.Entero();
			switch(opcion){
				case 1:
					resp="si";
					vC.menuClienteAdm();
				break;
				case 2:
				resp="si";
					vV.menuVehiculoAdm();
				break;
				case 3:
					resp="si";
					vU.menuUsuarioAdm();
				break;
				case 4:
					resp="si";
					System.out.println("Sesion Cerrada Correctamente");
					login.pantallaInicio();
				break;
				case 5: 
					System.exit(1);
				break;
				default:
				System.out.println("Esta Opcion No Es Valida");
			}	
		}while(resp.equalsIgnoreCase("no"));
	}
	public void menuTrabajador() throws IOException{
		do{
			resp="no";
			System.out.println("Bienvenido al menu Principal Trabajador");
			System.out.println("************************");
			System.out.println("1. Cliente");
			System.out.println("************************");
			System.out.println("2. Vehiculo");
			System.out.println("************************");
			System.out.println("3. Cerrar Sesion");
			System.out.println("************************");
			System.out.println("Trabajador Elija Una Opcion");
			System.out.println("************************");
			opcion=oT.Entero();
			switch(opcion){
				case 1:
					resp="si";
					vC.menuClienteTrab();
				break;
				case 2:
					resp="si";
					vV.menuVehiculoTrab();
				break;
				case 3:
					resp="si";
					System.out.println("Sesion Cerrada Correctamente");
					login.pantallaInicio();
				break;
				default:
				System.out.println("Esta Opcion No Es Valida");
			}
		}while(resp.equalsIgnoreCase("no"));
	}

}