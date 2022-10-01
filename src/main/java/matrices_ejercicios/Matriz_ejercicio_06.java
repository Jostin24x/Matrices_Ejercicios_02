package matrices_ejercicios;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
//EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA COLUMNAS PARES DE LA MATRIZ
public class Matriz_ejercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 4;
        int [][] matriz = new int[t][t];
        int [] sumF = new int [t];
        
        for(int i=0;i <matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                int num = (int) (Math.random()*100 + 1) ;

                matriz[i][j] = num;

                if(j % 2 == 0 && j != 0){
                    sumF[j] += matriz[i][j];
                }
            }
        }
        
        //Imprimir la matriz
        for(int i=0; i < matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        } 
        
        for(int i=0; i < sumF.length;i++){
            if(i % 2 == 0 && i != 0){
                System.out.println("La suma de la Columna pares "+(i)+" es : "+sumF[i]);
            }
        }
    }
}
