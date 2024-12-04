/*
WAP TO FIND MAX ELEMENT FROM THE GIVEN JRACKED ARRAY WHERE NUMBER OF ROWS ARE 3 AND NUMBER OF COLUMS
ARE 3,2,1
*/
import java.util.Scanner;

class Dhruvil{
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       int[][] a = new int[3][];
       a[0] = new int[3];
       a[1] = new int[2];
       a[2] = new int[1];
       
       for(int i = 0; i < a.length ; i++){
           for(int j = 0 ; j < a[i].length ; j++){
               System.out.println("Elements  " + " = ");
               a[i][j] = sc.nextInt();
           }
       }
       
       int max = a[0][0];
       for(int i = 0; i < a.length ; i++){
           for(int j = 0; j < a[i].length ;j++){
               if(a[i][j] > max){
                   max = a[i][j];
               }
           }
       }
       System.out.println("Max = " + max);
    }
    
}