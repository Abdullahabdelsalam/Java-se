package basic;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Bro Code";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("o");

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        //حزف spase
        name = name.replace("o", "a");

        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name DOESN'T contain any spaces");
        }

        if(name.equalsIgnoreCase("password")){
            // .equals("password")
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
//_______________________________________.substring()_______________________________________________________

        // .substring() = A method used to extract a portion of a string
        //                         .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");

        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Emails must contain @");
        }

        scanner.close();


    }

}
