import java.math.BigDecimal;
import java.util.Scanner;

class Calculator
{
    public static void main(String[] args)
    {
        Scanner calculator = new Scanner(System.in);

        System.out.println("1番目の数字: ");
        BigDecimal a = calculator.nextBigDecimal();

        System.out.println("数学演算記号: ");
        String x = calculator.next();

        System.out.println("2番目の数字: ");
        BigDecimal b = calculator.nextBigDecimal();

        if (x.contains("+"))
        {
            System.out.println("Result: \n" + a + " + " + b + " = " + (a.add(b)));
        }
        else if (x.contains("-"))
        {
            System.out.println("Result: \n" + a + " - " + b + " = " + (a.subtract(b)));
        }
        else if (x.contains("*"))
        {
            System.out.println("Result: \n" + a + " * " + b + " = " + (a.multiply(b)));
        }
        else if (x.contains("/"))
        {
            System.out.println("Result: \n" + a + " / " + b + " = " + (a.divide(b)));
        }
        else
        {
            System.out.println("Error!");
        }
        
        calculator.close();
    }
}