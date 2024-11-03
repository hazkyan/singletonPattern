public class PagIbigApp {
    public static void main(String[] args) {
        
        HelpDeskStation station1 = new HelpDeskStation("Help Desk 1");
        HelpDeskStation station2 = new HelpDeskStation("Help Desk 2");
        HelpDeskStation station3 = new HelpDeskStation("Help Desk 3");

        station1.serveNextCustomer();
        station2.serveNextCustomer();
        station3.serveNextCustomer();

        station1.displayCurrentQueueNumber();

        station2.resetQueue(10);

        station1.serveNextCustomer();
        station3.serveNextCustomer();
    }
}