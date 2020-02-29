import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        System.out.println("Enter any positive integer value");
        firstNumber = scanner.nextInt();

        System.out.println("Multiplication table for "+firstNumber);
        for(int i=1; i<=12; i=i+1)
        System.out.println(firstNumber*i +"="+i+"*"+firstNumber);

    }
}
