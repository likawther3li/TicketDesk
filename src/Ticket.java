public class Ticket {
    int id;
    String title;
    String description;
    String status;

    public Ticket(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = "Open";
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("----------------------");
    }
}


