package colegio;

import java.io.IOException;

public class Colegio {

    public static void main(String[] args) {
        
        int noPerros;
        int cont = 1;
        int opcion=0;
        String Nombre;
        String Raza;
        String Localidad;
        String Nombre_Dueño;
        Integer Cedula_Dueño;
        Integer Telefono;
        String Asistencia;
        
        System.out.println("Bienvenidos al Sistema de Colegios para Perros");
        System.out.println("Recuerde que nuestro sistema solo maneja mas de 10 perros");
        do{
            System.out.print("Cuantos Perros van a inscribirse : ");
            noPerros = LeerConsola.nextInt();
        }while(noPerros <10);
        
        
        Perros[] perro = new Perros[noPerros];
        
        for (int i=0;i<noPerros;i++){
            System.out.print("Ingrese el nombre del perro "+ cont +" : ");
            Nombre = LeerConsola.nextString();
            System.out.print("Ingrese la raza del perro " + cont +" : " );
            Raza = LeerConsola.nextString();
            System.out.print("Ingrese la localidad del perro " + cont +" : ");
            Localidad = LeerConsola.nextString();
            System.out.print("Ingrese el nombre del dueño del perro " + cont + " : ");
            Nombre_Dueño = LeerConsola.nextString();
            System.out.print("Ingrese el numero de cedula del dueño del perro "+ cont +" : ");
            Cedula_Dueño = LeerConsola.nextInt();
            System.out.print("Ingrese el numero de contacto del dueño del perro " + cont + " : ");
            Telefono = LeerConsola.nextInt();
            System.out.print("Ingrese el dia de asistencia del perro " + cont + " : ");
            Asistencia = LeerConsola.nextString();
            cont++;
            perro[i] = new Perros(Nombre,Raza,Localidad,Nombre_Dueño,Cedula_Dueño,Telefono,Asistencia,0);
        }
        do {
            System.out.println("[1]. Imprimir Lista detallada de perros inscritos");
            System.out.println("[2]. Imprimir informacion para rutas");
            System.out.println("[3]. Salir");
			
            System.out.print("Digite una opcion : ");
            opcion = LeerConsola.nextInt();
			
            switch(opcion) {
                case 1:
                    for(int i=0;i<noPerros;i++){
                        System.out.println(perro[i]);
                    }
                    System.out.println("Presione cualquier tecla para continuar...");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        System.out.println("Error");
                    }
                    break;
		case 2:
                    Perros.Localidad(perro, noPerros);
                    System.out.println("Presione cualquier tecla para continuar...");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        System.out.println("Error");
                    }
                    break;
                case 3: 
                    System.out.println("Saliendo del Sistema de Ascensores");
                    System.out.println("----------------");
                    break;
                default:
                    System.out.println("Selecciono una opcion invalida");
                    break;
            }
            for(int i=0;i<noPerros;i++){
                perro[i].setVisto(0);
            }
	}while(opcion!=3);
    }
    
}
