import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] titles = new String[5];
        String[] descriptions = new String[5];
        String[] status = new String[5];

        int count = 0;
        boolean running = true;

        while (running) {

            System.out.println("\nTicket Desk");
            System.out.println("1 Create Ticket");
            System.out.println("2 List Tickets");
            System.out.println("3 Exit");

            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {

                System.out.print("Enter title: ");
                titles[count] = input.nextLine();

                System.out.print("Enter description: ");
                descriptions[count] = input.nextLine();

                status[count] = "Open";

                count++;

                System.out.println("Ticket created");

            }

            if (choice == 2) {

                int i = 0;

                while (i < count) {

                    System.out.println("\nID: " + i);
                    System.out.println("Title: " + titles[i]);
                    System.out.println("Description: " + descriptions[i]);
                    System.out.println("Status: " + status[i]);

                    i++;
                }

            }

            if (choice == 3) {

                running = false;

            }
        }
    }
}
