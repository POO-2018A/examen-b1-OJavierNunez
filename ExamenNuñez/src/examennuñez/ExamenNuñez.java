package examennuñez;

import java.util.Scanner;

public class ExamenNuñez {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int opcion;
        int contadorLibros =0;
        Libro [] libros = new Libro[10];
        do{
            System.out.println("********** Biblioteca Personal **********\n");
            System.out.println("1.- Ingresar nuevo libro ");
            System.out.println("2.- Imprimir libros favoritos");
            System.out.println("3.- Ver libros y autores registrados");
            System.out.println("4.- Salir ");
            System.out.println(" Seleccione la opción que desea: ");
            opcion = scan.nextInt();
            
            switch (opcion){
                case 1:
                    if (contadorLibros == 10){
                        System.out.println("\n La lista de libros esta llena\n");
                        break;
                    }
                    //contadorLibros++;
                    //for (int i = 0; i < libros.length; i++){
                        System.out.println("******** Información del libro ********");
                        System.out.println("Titulo: ");
                        scan.nextLine();
                        String titulo = scan.nextLine();
                        System.out.println("Nombre del autor: ");
                        String nombreAutor = scan.nextLine();
                        System.out.println("Pais de origen: ");
                        String pais = scan.nextLine();
                        Autor autores = new Autor (nombreAutor, pais);
                        System.out.println("Año lanzamiento libro: ");
                        int año = scan.nextInt();
                        System.out.println("Lo considera como favorito?\n-------Escriba  true = (Si)   o    false = (No)");
                        boolean favorito = scan.nextBoolean();
                    
                        libros [contadorLibros] = new Libro (titulo, autores, año, favorito);
                        contadorLibros++;
                    //}
                    break;
                case 2:
                    if (contadorLibros ==0){
                        System.out.println("No se ha ingresado ningun libro. ");
                        System.out.println(" ");
                        break;
                    }
                    System.out.println("******** Libros Favoritos ********");
                    for (int j=0; j< contadorLibros; j++){
                        if ((libros[j].isFavorito()) == true ){
                            System.out.println("- Libro " + (j+1) + ":");
                            System.out.println(libros[j]);
                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    if (contadorLibros ==0){
                        System.out.println("No se ha ingresado ningun libro. ");
                        System.out.println(" ");
                        break;
                    }
                    
                    System.out.println("******** Libros Registrados ********");
                    for (int k=0; k < contadorLibros; k++){
                            System.out.println("- Libro " + (k+1) + ":");
                            System.out.println(libros[k]);
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Adios ");
                    break;
                default:
                    System.out.println("Opcion no valida ");
                    break;
                
            }
        }while(opcion != 4);
        
    }
  
}
