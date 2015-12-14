import java.util.Scanner;

public class InteractRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter \"+-*/\" : ");
                String sign = reader.next();
                System.out.println("Enter first arg : ");
                String first = reader.next();
                System.out.println("Enter second arg : ");
                String second = reader.next();
                switch (sign){
                    case "+":
                        calc.add(Integer.valueOf(first), Integer.valueOf(second));
                        break;
                    case "-":
                        calc.sub(Integer.valueOf(first), Integer.valueOf(second));
                        break;
                    case "*":
                        calc.mult(Integer.valueOf(first), Integer.valueOf(second));
                        break;
                    case "/":
                        calc.div(Integer.valueOf(first), Integer.valueOf(second));
                        break;
                    default:
                        calc.add(Integer.valueOf(first), Integer.valueOf(second));
                }
                System.out.println("Result : " + calc.getResult());
                System.out.println("Clean result : yes/no");
                if (reader.next().equals("yes")) {
                    calc.cleanResult();
                }
                System.out.println("Exit : yes/no");
                exit = reader.next();
            }
        }
        finally {
            reader.close();
        }
    }
}