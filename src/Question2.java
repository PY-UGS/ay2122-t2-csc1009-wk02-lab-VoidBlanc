import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double firstnum = input.nextDouble();
        double secondnum = input.nextDouble();
        double thirdnum = input.nextDouble();
        double average = (firstnum + secondnum + thirdnum)/3.0;
        System.out.println("The average of " + firstnum + " " + secondnum + " " + thirdnum + " is " + average);
        input.close();
    }
}
