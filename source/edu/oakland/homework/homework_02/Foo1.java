//Question 5

package edu.oakland.homework.homework_02;
import java.util.*;

public class Foo1{

	public static void main(String[] args){

		int alpha = Integer.parseInt(args[0]);
		int bravo = Integer.parseInt(args[1]);
		int charlie = Integer.parseInt(args[2]);

		int a[] = {alpha,bravo,charlie};

        // reverse bubble sort    
		int temp;
        for(int i=0; i < a.length-1; i++){
            for(int j=1; j < a.length-i; j++){
                if(a[j-1] < a[j]){
                    temp=a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }      
        }
		System.out.println(Arrays.toString(a));
	}
}