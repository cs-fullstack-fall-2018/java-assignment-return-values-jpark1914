import java.util.Scanner;

public class Exercise2_re {

    public static void main(String[] args){
        Scanner scanInput = new Scanner(System.in);
        String password1, password2= "";
        System.out.println("Enter your new password: ");
        password1 = scanInput.nextLine();
        System.out.println("Enter new password again: ");
        password2 = scanInput.nextLine();

        System.out.println("Does passwords match?" + checkPassword(password1,password2));


    }

    public static Boolean checkPassword(String password1, String password2){
        return password1.equals(password2);

    }
}
