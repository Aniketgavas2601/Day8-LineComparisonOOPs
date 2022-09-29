package com.bridgelabz.LineComp;
import java.util.Scanner; 

public class LineComparison {
	
	public static int x1;
	public static int x2;
	public static int y1;
	public static int y2;

public static void main(String[] args) {

    System.out.println("Welcome to Line Comparison Computation Program");
    Scanner sc = new Scanner(System.in);
    //for creating two line and find length of array
    int[] lineLengthArray = new int[2];
    for (int i = 1; i <= 2; i++) {
        System.out.println("Enter the start and end points of Line " + i + " (x1,y1) :");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter the start and end points of Line " + i + " (x2,y2) : ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("start coordinator (x1,y1) = " + x1 + " " + y1);
        System.out.println("End coordinator (x2,y2) = " + x2 + " " + y2);

        //calculate the length of array
        int lineLength = getLengthOfLine();
        //store the value of length of line in array
        lineLengthArray[i - 1] = lineLength;
        System.out.println("Length Of Line " + i + " :" + lineLength);

        //compare and check Equality
       
        }

    }
public static int getLengthOfLine() {
    return (int) Math.sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2);
}
}
