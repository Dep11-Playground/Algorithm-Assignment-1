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
        long first = 0;
        long second = 1;
        long next = 0;
        do {
            double previousFib = fib;

            if (num == 1){
                fib = first;
            }else if(num == 2){
                fib = second;
            }else{
                fib = first + second;
                first = second;
                second = fib;
            }
            
            num++;
        } while (num != input+1);

        System.out.println("Fib number : "+ fib);
    }
}