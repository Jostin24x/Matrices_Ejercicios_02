package matrices_ejercicios;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Matriz_ejercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[10][10];
        int multi1=0, multi2=0, prom, num;
        int pri[]=new int[matriz.length];
        int sec[]=new int[matriz.length];
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                num = (int) (Math.random()*100+1);
                matriz[i][j]=num;             
            }
        }
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println("");
        }        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(i==j){
                    pri[i]=matriz[i][j];
                    multi1 = multi1+matriz[i][j];
                }if((i+j) == matriz.length-1){
                    sec[i]=matriz[i][j];
                    multi2 = multi2+matriz[i][j];
                }
            }
        }
        
        prom = multi1*multi2;
        System.out.println("Diagonal principal: "+multi1);
        System.out.println("Diagonal secundaria: "+multi2);
        System.out.println("La multiplicacion de las diagonales es: "+prom);   
    }
}
