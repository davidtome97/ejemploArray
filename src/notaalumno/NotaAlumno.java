/*
 * nota alumno.
 */
package notaalumno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author David Tomé
 */
public class NotaAlumno {

 
    public static void main(String[] args) throws IOException {
        InputStreamReader flujo=new InputStreamReader (System.in);
        BufferedReader teclado=new BufferedReader (flujo);
        float nota;
        System.out.print("introduce tu nota: ");
        nota=Float.parseFloat(teclado.readLine());
        if (nota >10 || nota <0){
            System.out.println("La nota no es correcta");
            }
        else{
    if (nota >=0 && nota<5){
        System.out.println("Insuficiente");
    }
    if (nota >=5 && nota<6){
         System.out.println("Suficiente");
    }
     if (nota >=6 && nota<7){
         System.out.println("Bien");
    }   
     if (nota >=7 && nota<9){
         System.out.println("Notable");
    }   
      if (nota >=9 || nota==10){
         System.out.println("Sobresaliente");
    }      
    }//else
    }//main
    
    
}//final
