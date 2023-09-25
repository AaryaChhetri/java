import java.util.Scanner;

public class yz {
    public static void main(String[] args) {
        System.out.println("Login");
        String required_username, required_password, username, password;
        required_username = "Aarya";
        required_password = "9803525288";
        for(int i =1; i<=5; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your username:");
            username = sc.next();
            System.out.println("Enter your password:");
            password = sc.next();

            if((username.equals(required_username) ) && (password.equals(required_password) )){
                System.out.println("correct ");
                break;
            }else {
                System.out.println("try again");
            }
        }

    }
}
