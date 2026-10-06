import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class gyak1 {
    static void main(){
        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if (max<arr[i]){
                max= arr[i];
            }
        }
        System.out.println(max);


        int[] arr2 = { 10, 324, 45, 90, 9808 };
        int [] newlist = new int [arr.length + arr2.length];
        for(int i = 0; i<newlist.length; i++){
            if(i > arr.length-1)
            {
                newlist[i] = arr2[i-arr.length];
            }
            else
            {
                newlist[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newlist));

        double avg = 0;
        for(int i = 0; i<arr.length; i++){
            avg+=arr[i];
        }
        System.out.println(Math.round(avg/arr.length*100)/100.00);


        int [] a =arr;
        Arrays.sort(a);
        System.out.println(a[a.length-2]);


        String[] fizzbuzz = new String[100];
        for(int i = 0; i<fizzbuzz.length; i++){
            if((i+1)%3==0 && (i+1)%5==0){
                fizzbuzz[i] = "FizzBuzz";
            }
            else if((i+1)%3==0){
                fizzbuzz[i] = "Fizz";
            }
            else if((i+1)%5==0){
                fizzbuzz[i] = "Buzz";
            }
            else{
                fizzbuzz[i] = Integer.toString(i+1);
            }
        }
        for(int i =0; i< fizzbuzz.length;i++){
            System.out.print(fizzbuzz[i]);
            System.out.print(", ");
            if(i%15==14){
                System.out.println();
            }
        }

    }
}
