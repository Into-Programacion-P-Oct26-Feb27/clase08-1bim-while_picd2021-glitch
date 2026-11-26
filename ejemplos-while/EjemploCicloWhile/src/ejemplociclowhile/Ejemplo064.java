/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejemplo064 {
    
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean bandera = true;
        String salir;
        
        String pais;
        String formatear;
        int contPais = 0;
        
        pais = "Los paisese y sus capitales son:";
        
        while(bandera==true){
            System.out.println("Ingrese un país");
            formatear = entrada.nextLine();
            pais = String.format("%s\n%s",pais,formatear);
            contPais = contPais+1;
            System.out.println("Ingrese su capital");
            formatear= entrada.nextLine();
            pais = String.format("%s\n\t%s",pais, formatear );
            
            System.out.println("Si desea salir de ciclo ingrese si");
            salir = entrada.nextLine();
            
            if(salir.equals("si")){
                bandera = false;
                System.out.println(pais);
                System.out.println(contPais);
            }
            
        }
        /*el código valida el calor booleano de bandera que puede ser cambiado 
        usando el if con el entero salir*/
        
        }

    
}
