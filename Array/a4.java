/*
WAP to take input from users of elements and make sum, max,min,avg 
*/
import java.util.Scanner;

class Dhruvil{
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int[] a = new int[10];
       for(int i = 0;i < 10;i++){
           System.out.print("Please enter a value " + (i+1) + " = ");
           a[i] = sc.nextInt();    
       }
       int l = a.length , sum = 0;
       int min = a[0] , max = a[0];
       
       for(int i = 0;i < l;i++){
           sum = sum + a[i];
           
           if(a[i] > max){
               max = a[i];
           }
           else{
                min = a[i];
           }
       }
       System.out.println(sum);
       System.out.println(max);
       System.out.println(min);
       double p     = sum/l;
       System.out.println("AVG = " + p);
       
    }
    
}