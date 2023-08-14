import java.util.Scanner;

class Algo9 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str;
        boolean issentence = false;

        do {
            System.out.print("Enter a text: ");
            str = scanner.nextLine().strip();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    issentence = true;
                }
            }
        } while (str.isBlank() || issentence);

        boolean isPalindrome = false;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 - i) {
                if(str.charAt(i) == str.charAt(str.length() - 1 - i)){
                    isPalindrome = true;
                }else{
                    isPalindrome = false;
                }
            }
        }
        
        String strPalindrome = isPalindrome ? "Paindrome" : "Not a Palindrome";
        System.out.print(str + " is " + strPalindrome + " Word");
        System.out.println();
    }
}
