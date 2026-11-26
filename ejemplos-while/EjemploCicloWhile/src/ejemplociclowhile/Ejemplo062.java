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
public class Ejemplo062 {
    
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean bandera = true;
        String salir;
        
        while(bandera==true){
            System.out.println("Estoy en ciclo");
            
            
            System.out.println("Si desea salir de ciclo ingrese si");
            salir = entrada.nextLine();
            
            if(salir.equals("si")){
                bandera = false;
            }
            
        }
        /*el código valida el calor booleano de bandera que puede ser cambiado 
        usando el if con el entero salir*/
        
        }

    
}
