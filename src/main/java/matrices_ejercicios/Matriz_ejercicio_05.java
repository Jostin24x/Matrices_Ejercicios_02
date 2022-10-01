package matrices_ejercicios;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Matriz_ejercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 10;
        int [][] matriz = new int[t][t];
        int [] sumF = new int [t];
        
        for(int i=0;i <matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                int num = (int) (Math.random()*100 + 1) ;
                matriz[i][j] = num;

                if(j % 2 == 1){
                    sumF[j] += matriz[i][j];
                }
            }
        }
        
        //Imprimir la matriz
        for(int i=0; i < matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        } 
        
        for(int i=0; i < sumF.length;i++){
            if(i % 2 == 1){
                System.out.println("La suma de la Columna impar "+(i)+" es : "+sumF[i]);
            }
        }
    }
}