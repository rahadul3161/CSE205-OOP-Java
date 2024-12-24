//Write a Java program to check whether a year is a leap year or not.

import java.util.Scanner;
public class Rahadul_12 {
    public static void main(String[] args) {
		int year;
		System.out.println("Enter a year below: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		if (((year%4==0) && (year%100 !=0)) || (year%400==0)) {
		    System.out.println("It is a leap year");}
		else {
		    System.out.println("It is not a leap year");}
	}
}