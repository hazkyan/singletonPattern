public class QueueSystem {

    private static QueueSystem instance;
    private int currentQueueNumber;

    private QueueSystem() {
        currentQueueNumber = 0;
    }

    public static synchronized QueueSystem getInstance() {
        if (instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    public synchronized int getNextQueueNumber() {
        currentQueueNumber++;
        return currentQueueNumber;
    }

    public synchronized int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    public synchronized void resetQueueNumber(int newQueueNumber) {
        if (newQueueNumber >= 0) {
            currentQueueNumber = newQueueNumber;
            System.out.println("Queue number reset to: " + currentQueueNumber);
        } else {
            System.out.println("Invalid queue number.");
        }
    }
}