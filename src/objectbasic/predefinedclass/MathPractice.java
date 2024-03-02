package objectbasic.predefinedclass;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class MathPractice {


    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter the number x in double: ");
        double firstNumber=scanner1.nextDouble();
        System.out.println("Enter the  number y in double: ");
        double secondNumber=scanner1.nextDouble();
        scanner1.close();

        double[] returnedValue = Conversion(firstNumber,secondNumber);
        System.out.printf("absoluteValue of %f is %f\n",firstNumber,returnedValue[0]);
        printSpace();
        System.out.printf("floorInteger of %f is %f\n",firstNumber,returnedValue[1]);
        printSpace();
        System.out.printf("ceilInteger of %f is %f\n",firstNumber,returnedValue[2]);
        printSpace();
        System.out.printf("roundNumber of %f is %f\n ",firstNumber,returnedValue[3]);
        printSpace();
        System.out.printf("maximumValue of %f and %f is %f\n",firstNumber,secondNumber,returnedValue[4]);
        printSpace();
        System.out.printf("minimumValue of %f and %f is %f\n",firstNumber,secondNumber,returnedValue[5]);
        printSpace();
        System.out.printf("randomValue is %f\n",returnedValue[6]);
        printSpace();
        System.out.printf("signumNumber of %f is %f\n", firstNumber, returnedValue[7]);
        printSpace();
        System.out.printf("SquareRoot of %f is %f\n",firstNumber,returnedValue[8]);
        printSpace();

    }
    public static double[] Conversion(double x ,double z ){
      double absoluteValue=  Math.abs(x);
      double floorInteger=Math.floor(x);
      double ceilInteger=Math.ceil(x);
      double roundNumber=Math.round(x);
      double maximumValue = Math.max(x, z);
      double minimumValue=Math.min(x,z);
      double randomValue =Math.random();
      double signumNumber =Math.signum(x);
      double squareRoot=Math.sqrt(x);
      double[] convertedValue;
      convertedValue = new double[]{absoluteValue,floorInteger,ceilInteger,roundNumber,maximumValue,
                                         minimumValue,randomValue,squareRoot, signumNumber,};
      return convertedValue;


    }
    public static void printSpace(){
        System.out.println("---------------------------------------------------------------");
    }
}
