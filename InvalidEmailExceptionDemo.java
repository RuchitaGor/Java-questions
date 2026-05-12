import java.util.Scanner;

// User Defined Exception
class InvalidEmailException extends Exception {

    InvalidEmailException(String message) {
        super(message);
    }
}

public class InvalidEmailExceptionDemo {

    // Method to check email validity
    static void checkEmail(String email) throws InvalidEmailException {

        // Check whether first character is digit
        if(Character.isDigit(email.charAt(0))) {

            throw new InvalidEmailException(
                "Email should not start with digit"
            );
        }

        // Check whether email contains '@'
        if(!email.contains("@")) {

            throw new InvalidEmailException(
                "Email must contain @ symbol"
            );
        }

        System.out.println("Valid Email ID");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email ID : ");

        String email = sc.nextLine();

        try {

            checkEmail(email);

        } catch(InvalidEmailException e) {

            System.out.println("Exception : " + e.getMessage());
        }

        sc.close();
    }
}
