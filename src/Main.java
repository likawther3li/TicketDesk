import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketDesk desk = new TicketDesk();

        while (true) {
            System.out.println("1. Create Ticket");
            System.out.println("2. List Tickets");
            System.out.println("3. Update Ticket");
            System.out.println("4. Close Ticket");
            System.out.println("5. Exit");

            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Title: ");
                String title = scanner.nextLine();
                System.out.print("Enter Description: ");
                String desc = scanner.nextLine();
                desk.createTicket(id, title, desc);
            } else if (choice == 2) {
                desk.listTickets();
            } else if (choice == 3) {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new Title: ");
                String title = scanner.nextLine();
                desk.updateTicket(id, title);
            } else if (choice == 4) {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                desk.closeTicket(id);
            } else if (choice == 5) {
                break;
            }
        }
    }
}
