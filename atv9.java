import java.util.Scanner;

public class atv9{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();
        System.out.print("");

        System.out.print("O número " + n + " ao contrário é " + inverter(n));

    }
    public static int inverter (int number)
    {
        int reverse = 0; while (number > 0) { int lastDigit = number % 10;
            reverse = 10 * reverse + lastDigit; number = number / 10; } return reverse; }

    }
