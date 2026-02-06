package Array;

import java.util.Scanner;

public class ArrInput {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :  ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for(int i = 0; i < n; i++){

            marks[i] = sc.nextInt();

        }
        System.out.println("done !");
        System.out.print("Elements are : " );

        for(int i =0; i < marks.length; i++ ){

             System.out.print(marks[i] + " ");
        }

        sc.close();
    }
}
