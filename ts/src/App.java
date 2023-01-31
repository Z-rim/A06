import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float grade;
        char letter = 'A';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a grade between 0 and 100");
        grade = scanner.nextFloat();
    
            
        while (grade < 0 || grade > 100) {
            System.out.println("Grade must be between 0 and 100. Please input again");
            grade = scanner.nextFloat();

        }
        scanner.close();
        if (90 <= grade && grade <= 100){
            letter = 'A';
        }
        else if (80 <= grade && grade <= 90 ){
            letter = 'B';
        }
        else if (70 <= grade && grade <= 80){
            letter = 'c';
        }
        else if (60 <= grade && grade <= 70){
            letter = 'D';
        }
        else if (0 <= grade && grade <= 60){
            letter = 'F';
        }
        



        /*
         * Write your code to convert grade to letter
         * If 90 <= grade <= 100, then letter = 'A'
         * If 80 <= grade < 90, then letter = 'B'
         * If 70 <= grade < 80, then letter = 'C'
         * If 60 <= grade < 70, then letter = 'D'
         * If 0 <= grade < 60, then letter = 'F'
         */


        System.out.println("Grade = " + grade);
        System.out.println("Letter = " + letter);  
    }
}
