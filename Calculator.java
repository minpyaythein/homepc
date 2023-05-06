import java.util.Scanner;

class Calculator
{
    public static void main(String[] args)
    {
        Scanner calculator = new Scanner(System.in);

        System.out.println("1番目の数字: ");
        int a = Integer.parseInt(calculator.nextLine());

        System.out.println("数学演算記号: ");
        String x = calculator.nextLine();

        System.out.println("2番目の数字: ");
        int b = Integer.parseInt(calculator.nextLine());

        if (x == "+")
        {
            System.out.println(a + " + " + b + " = " + (a + b));
        }
        else if (x == "-")
        {
            System.out.println(a + " - " + b + " = " + (a - b));
        }
        else if (x == "*")
        {
            System.out.println(a + " * " + b + " = " + (a * b));
        }
        else if (x == "/")
        {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
        
        calculator.close();
    }
}