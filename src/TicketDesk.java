public class TicketDesk {

        Ticket[] tickets = new Ticket[100];
        int count = 0;

        public void createTicket(int id, String title, String description) {
            tickets[count] = new Ticket(id, title, description);
            count++;
            System.out.println("Ticket created successfully.");
        }

        public void listTickets() {
            if (count == 0) {
                System.out.println("No tickets found.");
                return;
            }
            for (int i = 0; i < count; i++) {
                tickets[i].display();
            }
        }

        public void updateTicket(int id, String newTitle) {
            for (int i = 0; i < count; i++) {
                if (tickets[i].id == id) {
                    tickets[i].title = newTitle;
                    System.out.println("Ticket updated.");
                    return;
                }
            }
            System.out.println("Ticket not found.");
        }

        public void closeTicket(int id) {
            for (int i = 0; i < count; i++) {
                if (tickets[i].id == id) {
                    tickets[i].status = "Closed";
                    System.out.println("Ticket closed.");
                    return;
                }
            }
            System.out.println("Ticket not found.");
        }
    }

