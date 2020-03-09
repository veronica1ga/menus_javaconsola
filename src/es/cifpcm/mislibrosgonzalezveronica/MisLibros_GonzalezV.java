/**
 * 
 */
package es.cifpcm.mislibrosgonzalezveronica;

import java.util.ArrayList;
import java.util.Scanner;

import es.cifpcm.mislibrosgonzalezveronica.data.ImpPerGonzalezV;
import es.cifpcm.mislibrosgonzalezveronica.data.Persistance;
import es.cifpcm.mislibrosgonzalezveronica.model.Libro;

import java.io.File;
import java.util.List;
/**
 * @author Veronica_Gonzalez
 *
 */
public class MisLibros_GonzalezV {

	/**
	 * @param args
	 */
	private static Persistance pst=new ImpPerGonzalezV();
	public static List<Libro> listaLibro = new ArrayList<Libro>();
	
	
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean salir=false;
        int opcion;
        do
        {
        	//System.out.println(System.getenv("temp"));
        	System.out.println("===========MIS LIBROS GONZÁLEZ==========");
        	System.out.println("-- Échese una siestita mientras nosotros buscamos");
            System.out.println("1. Busque libro por género");
            System.out.println("3. Mostrar todos los libros: ");
            System.out.println("0. Salir");
            System.out.println("--------------------");            
            System.out.println("2. Admin\n");
            System.out.print("Escribe una de las opciones: ");
            opcion = sc.nextInt();
            switch(opcion)
            {
                case 1:
                	for (int i=0; i < 30; i++)

               	 {

               	  System.out.println();

               	 }
                	listarLibro();
                    break;
                    
                case 2:
                	 for (int i=0; i < 30; i++)

                	 {

                	  System.out.println();

                	 }
                	System.out.println("===========MIS LIBROS GONZÁLEZ - ADMIN==========");
                    System.out.println("1. Añadir libro: ");
                    System.out.println("2. Borrar libro: ");
                    System.out.println("0. Salir");
                    System.out.print("Escribe una de las opciones: ");
                    int opcion2=sc.nextInt();
                    switch(opcion2)
                    {
                        case 1:
                        	insertarLibro();
                        break;
                        
                        case 2: 
                        	borrarLibro();
                        	
                        break;
                    }
                    break;
                case 3: 
                	for (int i=0; i < 30; i++)

               	 {

               	  System.out.println();

               	 }
                	listarTodo();
                	break;
                case 0:
                    salir=true;
                    System.out.println("YA HAS ACABADO POR HOY");
                    break;                    
                default:
                    System.out.println("Solo números entre 1 y 3");
    
            }
        }while (opcion!=0);
           
       
    }
   
    private static void listarTodo() {
		// TODO Auto-generated method stub
    	Scanner sc = new Scanner(System.in);
    	listaLibro= pst.list();
    	for (Libro l : listaLibro) {
    			System.out.println(l.getTitulo()+", "+l.getGenero()+", "+l.getnPaginas()+", "+l.getPrecio()+"€");
    			System.out.println("----------------------------------------");
        }
	}

	private static void insertarLibro()
    {
    	Libro l= new Libro();
    	Scanner sc = new Scanner(System.in);
    	 for (int i=0; i < 30; i++)

    	 {

    	  System.out.println();

    	 }
    	System.out.print("1. Añadir título: ");
    	String titulo = sc.nextLine();
    	System.out.print("2. Añadir género: ");
    	String genero = sc.nextLine();
    	System.out.print("4. Añadir número de páginas: ");
    	int pagina = sc.nextInt();
    	System.out.print("5. Añadir precio: ");
    	int precio = sc.nextInt();
    	l.setTitulo(titulo);
    	l.setGenero(genero);
    	l.setnPaginas(pagina);
    	l.setPrecio(precio);
    	pst.save(l);
    	System.out.println("YA HAS METIDO UN NUEVO LIBRO");
    }

    private static void listarLibro()
    {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Introduce el género que quieres buscar: ");
    	String genero = sc.nextLine();
    	listaLibro= pst.list();
    	for (Libro l : listaLibro) {
    		if(l.getGenero().contains(genero)) {
    			System.out.println(l.getTitulo()+", "+l.getGenero()+", "+l.getnPaginas()+", "+l.getPrecio()+"€");
    			System.out.println("----------------------------------------");
    		}
        }
    }
    
    private static void borrarLibro()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("1. Introduce un título a borrar: ");
    	String titulo = sc.nextLine();
    	listaLibro= pst.list();
    	for(Libro l:listaLibro) {
    		if(l.getTitulo().contains(titulo)){       
    			listaLibro.remove(l);
    		    //pst.delete(l);
    		}
    	}
    }
    

	private static void goAdminMenu()
    {
        
    }
    
    private static void printMainMenu()
    {
        
    }
    
    private static void printAdminMenu()
    {
        
    }
    
    private static Libro getNewLibroInput()
    {
        return null;
        
    }
    
    private static Libro getDeleteLibroInput()
    {
        return null;
        
    }
    
    private static int getOpcion()
    {
        return 0;
        
    }

}
