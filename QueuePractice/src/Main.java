import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {
    Queue<String> names = new LinkedList<>();
    names.offer("Alice");
    names.offer("Bob");
    names.offer("Charlie");
    names.offer("David");

    System.out.println("The queue is: " + names);
    System.out.println("The person at the front is: " + names.peek());

    names.poll();
    System.out.println("After removing one person, the queue is: " + names);
    names.poll();
    System.out.println("After removing another person, the queue is: " + names);

    System.out.println("The current size of the queue is: " + names.size());
    System.out.println("Is the queue empty? " + names.isEmpty());
  }
}