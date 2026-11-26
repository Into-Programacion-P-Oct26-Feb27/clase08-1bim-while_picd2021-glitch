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
public class Ejemplo061 {
    
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean bandera = true;
        
        
        while(bandera==true){
            System.out.println("Estoy en ciclo");
            int salir;
            
            System.out.println("Si desea salir de ciclo ingresa -100");
            entrada.nextInt();
            
            if(salir == -100){
                bandera = false;
            }
            
        }
        
        }

    
}
