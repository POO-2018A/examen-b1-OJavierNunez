package correccionexamen;

import java.util.Arrays;
import java.util.Scanner;

public class CorreccionExamen {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int opcion;
        int contadorLibros =0;
        int contadorAutores =0;
        Libro [] libros = new Libro[10];
        Autor autores [] = new Autor [10];
        do{
            System.out.println("********** Biblioteca Personal **********\n");
            System.out.println("1.- Ingresar nuevo libro ");
            System.out.println("2.- Imprimir libros favoritos");
            System.out.println("3.- Lista de autores ingresados");
            System.out.println("4.- Salir ");
            System.out.println(" Seleccione la opción que desea: ");
            opcion = scan.nextInt();
            
            switch (opcion){
                case 1:
                    if (contadorLibros == 10){
                        System.out.println("\n La lista de libros esta llena\n");
                        break;
                    }
                        System.out.println("******** Información del libro ********");
                        System.out.println("Titulo: ");
                        scan.nextLine();
                        String titulo = scan.nextLine();
                        System.out.println("Nombre del autor: ");
                        String nombreAutor = scan.nextLine();
                        System.out.println("Pais de origen: ");
                        String pais = scan.nextLine();
                        autores [contadorAutores] = new Autor (nombreAutor, pais);
                        contadorAutores++;
                        System.out.println("Año lanzamiento libro: ");
                        int año = scan.nextInt();
                        System.out.println("Lo considera como favorito?\n-------Escriba  true = (Si)   o    false = (No)");
                        boolean favorito = scan.nextBoolean();
                    
                        libros [contadorLibros] = new Libro (titulo, autores, año, favorito);
                        contadorLibros++;
                   
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
                    if (contadorAutores ==0){
                        System.out.println("No se ha ingresado ningun Autor. ");
                        System.out.println(" ");
                        break;
                    }
                    int alternativa;
                    do{
                        System.out.println("\n********Autores Ingresados******* ");
                        for (int i=0; i< contadorLibros; i++){
                            //System.out.println((i+1)+" "+libros[i].getAutor()); 
                            System.out.println("        "+(i+1)+".- "+Arrays.asList(autores[i].getNombre()));
                        }
                        System.out.println("**Seleccione un autor para ver la cantidad de libros registrados*** ");
                        System.out.println("o Presione --> 11 para volver al menu principal ");
                        alternativa = scan.nextInt();
                        if (alternativa <= contadorLibros){
                            System.out.println(" Autor: "+Arrays.asList(autores[alternativa-1].getNombre()));
                            System.out.println(" Cantidad de libros: 1");
                            System.out.println(" Titulo libro: "+Arrays.asList(libros[alternativa-1].getTitulo()));  
                        }else{
                            System.out.println(" Opcion invalida");
                        } 
                        
                    }while (alternativa != 11);
                    
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
