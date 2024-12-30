//Write a Java program to swap two numbers.
public class Rahadul_10 {
    public static void main(String[] args) {
        int A=20, B=25;
        System.out.println("Before Swap; A = "+A);       
        System.out.println("Before Swap; B = "+B);
        System.out.println("============================");

        int temp=A;
        A=B;
        B=temp;
        System.out.println("After Swap; A = "+A);
        System.out.println("After Swap; B = "+B);
        
    }
}