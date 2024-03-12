package objectbasic.assignment9;

import java.util.Arrays;

public class StringDetail {
    public static void main(String[] args) {
        String policyNumbers1 =  "06000001,A,50000;01000001,S,40000;02000005,Q,25000";
        //Split the String by semicolon to seperate individual polcy details
        String[] numbers=policyNumbers1.split(";");
        System.out.println(Arrays.toString(numbers));
        for (int i=0;i<=numbers.length-1;i++){


            System.out.printf("Policy %s is %s\n", i+1, numbers[i]);

        }



    }
}
