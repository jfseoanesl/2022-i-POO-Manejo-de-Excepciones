package vista;

import Excepciones.MyExcepcion;
import java.util.Scanner;
import modelo.Producto;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean conExcepcion=true;
        try{ // codigo que puede generar excepciones
            System.out.println("Caso 1: ");
            System.out.println("Escriba un entero: ");
            int num = lector.nextInt();
             System.out.println("Escriba otro entero: ");
            int den = lector.nextInt();
            System.out.println("Div = " + num / den);

            System.out.println("Caso 2: ");
            Producto p = new Producto(123, null, 200);
            System.out.println("Producto: " + p.obtenerString());

            System.out.println("Caso 3: ");
            int arreglo[] = {1,2,3,4};
            System.out.println("Arreglo[5]=" + arreglo[2]);
            
            conExcepcion= false;
           
        }
        
        catch(java.lang.ArithmeticException e){
            System.out.println("Se ha generado excepcion de tipo ArithmeticException");
            System.out.println("Causa:  No se puede dividir por cero");
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Se genero execpcion de tipo InputmisMacthException");
            System.out.println("Causa: se requiere solo valores enteros");
            lector.nextLine();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Se ha generado excepcion de tipo ArrayIndexOutOfBoundsException");
            System.out.println("Causa:  el indice sobrepasa el tamaño del arreglo");
        }
        catch(MyExcepcion e){
            System.out.println("Se ha generado una excepcion de tipo Nullpointer: " );
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        finally{
            if(conExcepcion)
                System.out.println("El codigo genero exepciones");
            else
                System.out.println("El codigo no genero exepciones");
        }
        
        
        
    }
}
