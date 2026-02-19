import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String email;

        while (true) {
            System.out.print("Enter email: ");
            email = sc.nextLine();

            if (email.contains("@")) {
                break; // valid email → exit loop
            } else {
                System.out.println("Your mail does not contain @. Please enter again.");
            }
        }

        String username = email.substring(0, email.indexOf("@"));
        System.out.println("Your username is: " + username);
        String domain = email.substring(email.indexOf("@"));
        System.out.println("Your domain is:"+domain);

        sc.close();
    }
}