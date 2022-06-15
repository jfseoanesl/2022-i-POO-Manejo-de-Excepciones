package vista;

import Excepciones.MyExcepcion;
import java.util.InputMismatchException;
import java.util.Scanner;
import modelo.Parrafo;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        boolean conExcepcion=true;
        
        try{
            System.out.println("Caso 1:  tipo de datos");
            System.out.print("Registre un numero entero: ");
            int num = lector.nextInt();
            System.out.print("Registre otro numero entero: ");
            int den = lector.nextInt();
            System.out.println("Division="+num/den);


            System.out.println("\nCaso 2: indices de arreglos");
            int arreglo[] = {5,9,7,3,6};
            System.out.println("Arreglo[5]="+arreglo[4]);

            System.out.println("\n Caso 3: Objetos");
            Parrafo parrafo = new Parrafo(null);
            parrafo.imprimirTexto();
            
            conExcepcion=false;
        }
        
        catch(InputMismatchException e){
            System.out.println("genero excepcion del tipo InputMismatchException");
            System.out.println("Causa: se requiere solo valores enteros");
        }
        catch(ArithmeticException e){
            System.out.println("Genero excepcion del tipo ArithmeticException");
            System.out.println("Causa: el denominador no puede ser cero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Genero excepcion del tipo ArrayIndexOutOfBoundsException");
            System.out.println("Causa: el indice del arreglo supera su tamaño" );
        }
        catch(MyExcepcion e){
            System.out.println("Genero excepcion del tipo NullPointerException");
            System.out.println("Causa: " + e.getMessage() );
           // e.printStackTrace(System.out);
        }
        finally{
            if(conExcepcion)
                System.out.println("El codigo genero excepcion");
            else
                System.out.println("El codigo no genero excepcion");
        }
    }
}
