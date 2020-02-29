import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 0;
        int ans = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number");
        firstNumber = scanner.nextInt();
        System.out.println("Enter the second Number");
        secondNumber = scanner.nextInt();
        for (int i=1; i<=secondNumber; i=i+1)
        ans = firstNumber*ans;
        System.out.println(ans);
    }}
