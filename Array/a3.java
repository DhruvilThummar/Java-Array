/*
WAP to take input from users and give output of all entered elements
*/
import java.util.Scanner;

class Dhruvil{
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int[] a = new int[10];
       for(int i = 0;i < 10;i++){
           System.out.print("Please enter a value = ");
           a[i] = sc.nextInt();    
       }
       int l = a.length;
       for(int i = 0;i < l;i++){
           System.out.println(a[i]);
       }
       
    }
    
}