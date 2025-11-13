/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S A16
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
       entrada.useLocale(Locale.US);       
       double pago = 25;
       double pagoTotal;
       double valorDescuento;
       String cadena;
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su usuario");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su parroquia");
        String parroquia = entrada.nextLine();
        System.out.println("Ingrese el dia de pago");
        int diaPago = entrada.nextInt();
        System.out.println("");
        
        
        if ((diaPago <= 10) && ((parroquia.equals("El Valle")) || 
                parroquia.equals("El Sagrario"))) {
            valorDescuento = pago * 0.05;
            pagoTotal = pago - valorDescuento;
            System.out.printf("FACTURA DETALLADA\n\nNombre y Apellido: %s %s"
                    + "\nUsuario: %s\nEdad: %s\nParroquia: %s\nDia de Pago:"
                    + " %s\nPor cancelar antes del dia 10:\nSe le "
                    + "otorga un descuento del 5 porciento\nEs decir: %.2f\nSu "
                    + "total a pagar es:%.2f\n",nombre,apellido,usuario,edad,
                    parroquia,diaPago,valorDescuento,pagoTotal);            
            } else {
                System.out.printf("FACTURA DETALLADA\n\nNombre y Apellido: "
                        + "%s %s\nUsuario: %s\nEdad: %s\nParroquia: %s\nDia"
                        + " de Pago: %s\nSu total a pagar es: %.2f\n",nombre,
                apellido,usuario,edad,parroquia,diaPago,pago);
                }            
        }        
    }