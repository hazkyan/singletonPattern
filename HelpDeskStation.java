public class HelpDeskStation {
    private String stationName;

    public HelpDeskStation(String stationName) {
        this.stationName = stationName;
    }

    public void serveNextCustomer() {
        QueueSystem queueSystem = QueueSystem.getInstance();
        int nextNumber = queueSystem.getNextQueueNumber();
        System.out.println("Serving customer with queue number: " + nextNumber + " at " + stationName);
    }

    public void displayCurrentQueueNumber() {
        QueueSystem queueSystem = QueueSystem.getInstance();
        System.out.println("Current queue number displayed: " + queueSystem.getCurrentQueueNumber());
    }

    public void resetQueue(int newQueueNumber) {
        QueueSystem queueSystem = QueueSystem.getInstance();
        queueSystem.resetQueueNumber(newQueueNumber);
        System.out.println("Queue has been reset by " + stationName);
    }
}