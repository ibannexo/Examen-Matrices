import java.util.Scanner;
 
public class Matrices {
     
    private static Scanner sc;
 
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        inicializar(matriz);
        System.out.println("Matriz original");
        visualizar(matriz);
        sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println("\nMatriz multiplicada por el escalar " + num);
        multiplicarEscalar(matriz, num);
        visualizar(matriz);
    }
     
    static void multiplicarEscalar(int[][] pMatriz, int escalar){
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                pMatriz[i][j] *= escalar;
            }
        }
    }
     
    static void inicializar(int[][] pMatriz){
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                pMatriz[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
    }
     //manda randon
    static void visualizar(int[][] pMatriz){
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                System.out.print("\t" + pMatriz[i][j]);
            }
            System.out.println();
        }
    }
}