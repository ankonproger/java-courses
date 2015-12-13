public class Calculate {
    public static void main(String[] args) {
        System.out.println("Calculate...");
        double first = Double.valueOf(args[0]);
        double second = Double.valueOf(args[1]);
        System.out.printf("%.1f + %.1f = %.1f%n", first, second, first + second);
        System.out.printf("%.1f - %.1f = %.1f%n", first, second, first - second);
        System.out.printf("%.1f * %.1f = %.1f%n", first, second, first * second);
        System.out.printf("%.1f / %.1f = %.1f%n", first, second, first / second);
    }
}