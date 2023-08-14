import java.util.Scanner;

class Algo10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isValid = false;
        doloop:
        do {
            System.out.println("Enter number in one of these formats. +94 XX XXX XXXX or 0XX-XXXXXXX");
            String usrInput = scanner.nextLine().strip();
            if(usrInput.isBlank()){
                System.out.println("Telephone number can't be empty");
                continue;
            }
            
            if(usrInput.startsWith("+94", 0) & usrInput.charAt(3) ==' ' & usrInput.charAt(6) ==' ' & usrInput.charAt(10) ==' '){
                for (int i = 0; i < usrInput.length(); i++) {
                    if(i < 3 | i== 3 | i == 6 | i == 10 ){
                        continue;
                    }
                    char charAt = usrInput.charAt(i);
                    if(!Character.isDigit(charAt)){
                        isValid = false;
                        break doloop;
                    }
                }
                isValid = true;
                
            }
            if(usrInput.startsWith("0", 0) & usrInput.charAt(3) =='-'){
                for (int i = 0; i < usrInput.length(); i++) {
                    if(i == 3){
                        continue;
                    }
                    char charAt = usrInput.charAt(i);
                    if(!Character.isDigit(charAt)){
                        isValid = false;
                        break doloop;
                    }
                }
                isValid = true;

            }
            if(isValid) {
                System.out.println("Valid input");  
            }else{
                System.out.println("invalid input");
            }

        } while (!isValid);
    }
}
