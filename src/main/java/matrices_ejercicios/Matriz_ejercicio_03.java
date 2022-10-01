package matrices_ejercicios;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
//EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA FILAS DE LA MATRIZ
public class Matriz_ejercicio_03 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[10][10];
        int suma = 0;
        int num;

        for(int i=0;i <matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                num = (int) (Math.random()*100+1);
                matriz[i][j] = num;
            }
        } 
        for(int i=0; i < matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        } 
        //Suma de Filas
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                suma += matriz[i][j];
            }
            System.out.println("La suma de la fila "+(i+1)+" es: "+suma);
        }
    }
}
