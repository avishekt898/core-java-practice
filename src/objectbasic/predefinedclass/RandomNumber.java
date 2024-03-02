package objectbasic.predefinedclass;
import java.util.Random;
import java.util.Scanner;


public class RandomNumber {

    public static void main(String[] args){

       for (int i =1; i<=95; i++) {

            Random x = new Random();
           int randomValue = x.nextInt(1, 95);
            System.out.printf("The random value of %d is %d \n",i,randomValue);

        }

    }
    }

