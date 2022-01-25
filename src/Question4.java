import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] zodiaclist = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        System.out.print("Enter a year : ");
        int year = input.nextInt();
        System.out.print(zodiaclist[year%12]);

        input.close();
    }
}
