import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        int firstNumber = 0;
        int ans = 1;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a positive integer");
        firstNumber = scanner.nextInt();
        System.out.println("Factorial value of"+firstNumber+"is ");
        for (int i=1; i<=firstNumber ;i=i+1)
            ans = ans*i;
        System.out.println(ans);


    }
}
