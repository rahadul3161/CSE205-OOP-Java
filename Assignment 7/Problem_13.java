/*Write a Java program for the following grading system.
Note: Percentage>=90% : Grade A
Percentage>=80% : Grade B
Percentage>=70% : Grade C
Percentage>=60% : Grade D
Percentage>=40% : Grade E
Percentage< 40% : Grade F */

public class Rahadul_13 {
    public static void main(String[] args){
        int mark=75;
        char grade;
        
        if (mark >= 90) {
            grade = 'A';} 
        else if (mark>= 80) {
            grade = 'B';} 
        else if (mark >= 70) {
            grade = 'C';} 
        else if (mark >= 60) {
            grade = 'D';} 
        else if (mark >= 40) {
            grade = 'E';} 
        else {
            grade = 'F';}
        
        System.out.println("The grade for a percentage of " + mark + "% is: " + grade);
    }
    
}
