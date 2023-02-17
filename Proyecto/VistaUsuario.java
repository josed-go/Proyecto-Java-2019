package org.jose.vista;
import java.io.IOException;
import org.jose.clase.UsuarioCreado;
import org.jose.controlador.ObtenerTexto;
import org.jose.controlador.ManejadorUsuario;
public class VistaUsuario{
	ObtenerTexto oT=new ObtenerTexto();
	UsuarioCreado uC=new UsuarioCreado();
	ManejadorUsuario mU=new ManejadorUsuario();
		String usuario1;
		String clave1;
		String rol1;
		int id1=0;
	public void menuUsuarioAdm() throws IOException{
		int opci;
		String resp;
		Menu menu=new Menu();
		do{
			resp="no";
			System.out.println("Administrador  "  +uC.getUsuario1()+  "  Elijio Usuario");
			System.out.println("************************");
			System.out.println("1. Ingresar");
			System.out.println("2. Modificar");
			System.out.println("3. Eliminar");
			System.out.println("4. Reporte");
			System.out.println("5. Regresar");
			System.out.println("Administrador  "  +uC.getUsuario1()+ "  Elija Una Opcion");
			opci=oT.Entero();
			switch(opci){
				case 1:
					mU.ingresarUsuario(usuario1,clave1,rol1,id1);	
				break;
				case 2:
					mU.modUsuario();
				break;
				case 3:
					mU.eliminarUsuario();
				break;
				case 4:
					mU.Reporte();
				break;
				case 5:
					resp="si";
					menu.menuAdmin();
				break;
				default:
				System.out.println("Esta Opcion No Es Valida");
			}
		}while(resp.equalsIgnoreCase("no"));
	}

}