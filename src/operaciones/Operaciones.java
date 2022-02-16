
package operaciones;

import java.util.Scanner;
import static java.lang.Math.abs;
import java.util.InputMismatchException;

public class Operaciones {
    
    private static boolean validaPalindromo(int leeNumero) {
        int consultaNumero = invierteNumero(leeNumero);
        return leeNumero == consultaNumero;
    }

    private static int invierteNumero(int leeNumero) {
        int consultaNumero = 0;
        while (leeNumero> 0) {
            int digito = leeNumero % 10;
            consultaNumero *= 10;
            consultaNumero += digito;
            leeNumero /= 10;
        }
        return consultaNumero;
    }    
    
    public static void main(String[] args) {
                       
        Scanner captura = new Scanner (System.in);
        double variable1,variable2,suma,resta,division,multiplicacion;        
        boolean salir = false;
        int opcion;
        
        while (!salir){
        
            System.out.println("Menú de Operaciones");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Verificación de número primo");
            System.out.println("6. Verificación de número palíndromo");
            System.out.println("7. Salir" + "\n");
            
            
            try {
                
                System.out.println("Seleccione la operacion que desea realizar: ");
                opcion = captura.nextInt();
                
                switch (opcion) {
                    case 1: 
                        System.out.println("Has seleccionado la opcion de sumar");
                        System.out.println("Digite el primer número");
                        variable1 = captura.nextDouble();
                        System.out.println("Digite el segundo número");
                        variable2 = captura.nextDouble();
                        suma = variable1 + variable2;
                        System.out.println("\n" + "El resultado de la suma es: " + suma + "\n");
                        break;
                                          
                    case 2:
                        System.out.println("Has seleccionado la opcion de restar");
                        System.out.println("Digite el primer número");
                        variable1 = captura.nextDouble();
                        System.out.println("Digite el segundo número");
                        variable2 = captura.nextDouble();
                        resta = variable1 - variable2;
                        System.out.println("El resultado de la resta es: " + resta + "\n");
                        break;

                    case 3:
                        System.out.println("Has seleccionado la opcion de multiplicar");
                        System.out.println("Digite el primer número");
                        variable1 = captura.nextDouble();
                        System.out.println("Digite el segundo número");
                        variable2 = captura.nextDouble();
                        multiplicacion =  variable1 * variable2;
                        System.out.println("El resultado de la multiplicación es: " + multiplicacion + "\n");
                        break;    
                        
                    case 4:
                        System.out.println("Has seleccionado la opcion de dividir");
                        System.out.println("Digite el primer número");
                        variable1 = captura.nextDouble();
                        System.out.println("Digite el segundo número");
                        variable2 = captura.nextDouble();
                        division =  variable1 / variable2;
                        System.out.println("El resultado de la division es: " + division + "\n");
                        break; 
                    
                    case 5:
                        System.out.println("Has seleccionado la opción de verificación de número primo");
                        int contador = 2;
                        double capturaPrimo;
                        boolean verificaPrimo = true;
                        System.out.println("Digite el número que desea validar");
                        capturaPrimo = captura.nextDouble();    
                        
                        while( verificaPrimo && (contador != capturaPrimo)){
                            if (capturaPrimo % contador == 0)
                            {
                                verificaPrimo = false;                       
                                                       
                            }   contador++;                                             
                        }
                        
                        if (verificaPrimo){
                         System.out.println("El numero " + capturaPrimo + " SI es primo" + "\n");
                        
                        }else{
                         System.out.println("El numero " + capturaPrimo + " NO es primo" + "\n" );
                        }                                                                 
                        break;
                    
                    case 6:
                        System.out.println("Has seleccionado la opción de verificación de número palindromo");                       
                        int leeNumero;
                        Scanner reader = new Scanner(System.in);
                        System.out.println("Digite el número que desea validar");
                        leeNumero = reader.nextInt();                       
                        leeNumero = abs(leeNumero);
                            if (validaPalindromo(leeNumero)) {
                            System.out.printf("El número es palíndromo" + "\n");
                            } else {
                            System.out.printf("El número no es palíndromo" + "\n");
                            }                                     
                        break;
                                                                             
                    case 7:
                        salir = true;
                        break;
                    
                    default:
                        System.out.println("Opción no válida" + "\n");                       
                }
                
            } catch (InputMismatchException e) {
                
                System.out.println("Favor inserte un numero" + "\n");
                captura.next();
            }
        }
              
                
    }
    
}
