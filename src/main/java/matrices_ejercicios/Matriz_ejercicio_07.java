package matrices_ejercicios;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Matriz_ejercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 10;
        int [][] matriz = new int[t][t];
        int [] impar = new int [t];
        
        for(int i=0;i <matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                int num = (int) (Math.random()*100 + 1) ;
                matriz[i][j] = num;
            }
        }
    
        //Imprimir la matriz
        for(int i=0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(j%2==1){
                    impar[j] += matriz[i][j];
                }
            }
        }

        for(int j=0;j<matriz.length;j++){
            if(j%2==1){
                System.out.println("La suma de la filas impares "+j+" es: "+impar[j]);
            }
        }
    }
}
