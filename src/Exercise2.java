import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args){
        passcode();

    }
    public static String passcode(){
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Please enter your password");
        String pass = scanIn.nextLine();
        System.out.println("Confirm your password");
        String confirmPass = scanIn.nextLine();
        while(!confirmPass.equals(pass)){
            System.out.println("Passwords don't match, try again!");
            pass = scanIn.nextLine();
            System.out.println("Confirm your password");
            confirmPass = scanIn.nextLine();
            if(confirmPass.equals(pass)){
                return "true";
            } else{
                return "false";
            }
        }
        return "true";
    }
}
