package Contacts_and_messages;

import java.util.*;

public class challenge3main {

    public static Scanner sc;
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        Map<String, String> contacts = new HashMap<>();//map for contacts

        contacts.put("Om", "9555647509"); //contacts stored by default
        contacts.put("Mom", "6387246088");
        contacts.put("Dad", "8299535626");

        ArrayList<messages> allMessages = new ArrayList<>();//Arraylist of each individual message 
        allMessages.add(new messages("Om", "You", "Hi, what's up bro"));//messages stored by default
        allMessages.add(new messages("Mom", "You", "Bring some milk while returning"));
        allMessages.add(new messages("You", "Dad", "Dad, sent some money to me."));

        System.out.println("Hello there user! Choose one of the following options: ");
        System.out.println("1. Contacts\t2. Messages\t3. Quit");
        int choice = sc.nextInt();
        while (true) {
            if (choice == 1) {
                System.out.println("1. Show all contacts\n2. Add a new contact" +
                        "\n3. Search for a contact\n4. Delete a contact\n5. Go back to the previous menu");
                int internalChoice = sc.nextInt();
                while (true) {
                    if (internalChoice == 1) {
                        for (Map.Entry<String, String> entry : contacts.entrySet())
                            System.out.println("Name = " + entry.getKey() +
                                    ", Number = " + entry.getValue());

                    } else if (internalChoice == 2) {
                        System.out.println("For adding a new contact, enter the username: ");
                        String username = sc.next();
                        System.out.println("Now, enter the phone number: ");
                        String number = sc.next();

                        contacts.put(username, number);
                        System.out.println("Contact added sucessfully");
                    } else if (internalChoice == 3) {
                        System.out.println("Enter the username you want to search: ");
                        String searchName = sc.next();
                        if (contacts.containsKey(searchName)) {
                            System.out.println("Name : " + searchName + "\nPhone Number : " + contacts.get(searchName));

                        } else {
                            System.out.println("The username doesn't exsists");
                        }
                    } else if (internalChoice == 4) {
                        System.out.println("Enter the user name to be deleted: ");
                        String userName = sc.next();
                        if (contacts.containsKey(userName)) {
                            contacts.remove(userName);
                            System.out.println("The user has been removed sucessfully.");

                        } else {
                            System.out.println("The user doesn't exist.");
                        }

                    } else if (internalChoice == 5) {
                        break;
                    } else {
                        System.out.println("The input is wrong, please enter again: ");
                        internalChoice = sc.nextInt();
                    }
                    System.out.println("1. Show all contacts\n2. Add a new contact" +
                            "\n3. Search for a contact\n4. Delete a contact\n5. Go back to the previous menu");
                    internalChoice = sc.nextInt();
                }

            } else if (choice == 2) {
                System.out.println("Enter a choice\n1. Show all messages\n" +
                        "2. Send a new message\n3. Go back to previous menu");

                int internalChoice = sc.nextInt();
                while (true) {
                    if (internalChoice == 1) {
                        for (messages msg : allMessages) {
                            System.out.println(msg.getSenderName() + " to " +
                                    msg.getReceiverName() + "\nMessage: " + msg.getMessage());

                        }
                    }else if (internalChoice ==2){
                        System.out.println("Enter the user's name you want to send a message to: ");
                        String username = sc.next();
                        if(contacts.containsKey(username)){
                            System.out.println("Enter the message you want to send: ");
                            String messageToBeSent = sc.nextLine();
                            messageToBeSent = sc.nextLine();
                            allMessages.add(new messages("You", username, messageToBeSent));
                            System.out.println("Message sent successfully");
                        }else{
                            System.out.println("The username is not saved as contact!!");
                        }
                    }
                    else if (internalChoice ==3){
                        break;
                    }else{
                        System.out.println("Wrong input!!");
                    }
                    System.out.println("Enter a choice\n1. Show all messages\n" +
                        "2. Send a new message\n3. Go back to previous menu");

                internalChoice = sc.nextInt();
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Wrong input, enter a valid option.");
                System.out.println("1. Contacts\t2. Messages\t3. Quit");
                choice = sc.nextInt();
            }
            System.out.println("1. Contacts\t2. Messages\t3. Quit");
            choice = sc.nextInt();

        }
        sc.close();

    }
}
