import java.util.Scanner;

class Algo1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input;
        long fib = 0;
        do {
            System.out.print("Enter a number: ");
            input = scanner.nextInt();
            scanner.nextLine();

            if (input < 0) {
                System.out.println("Enter a Positive Number");
            }
        } while (input < 0);

        int num = 0;
        do {
            double previousFib = fib;
            fib +=  
            num++;
        } while (num != input);

        System.out.println("Fib number : "+ fib);
    }
}