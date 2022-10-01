package matrices_ejercicios;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Matriz_ejercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 10;
        int [][] matriz = new int[t][t];
        int [] par = new int [t];
        int num;
        
        for(int i=0;i <matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                num = (int) (Math.random()*100+1);
                matriz[i][j] = num;
            }
        } 
        //Imprimir matriz
        for(int i=0; i < matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(j%2==1){
                    par[j] += matriz[i][j];
                }
            }
        }
        for(int i=0;i<matriz.length;i++){
            if(i%2==1){
                System.out.println("La suma de la filas pares "+i+" es: "+par[i]);
            }
        }  
       
    }
}
