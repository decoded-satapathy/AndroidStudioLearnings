package Contacts_and_messages;

import java.util.Scanner;
import java.util.ArrayList;

public class trial {
   private static ArrayList<String> names = new ArrayList<>();
//    names.add("Tom");
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        names.add("Tom");
        System.out.println(names.get(0));
        int s = sc.nextInt();
        // Scanner  sc = new Scanner(System.in);

        // String msg = sc.nextLine();
        // System.out.println("Message : "+msg);
        // sc.close();
    }
}
