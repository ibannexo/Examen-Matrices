import java.util.Scanner;
 
public class MatrizForma {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = sc.nextInt();
        sc.close();
 
        System.out.println();
        for(int altura = 0; altura<=numFilas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                
            }
 
            //Asteriscos
            for(int numero=1; numero<=(altura*2)-1; numero++){
                System.out.print(numero);
            }
            System.out.println();
        }
    }
}