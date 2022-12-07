// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Queue;

public class dz4_2 {
    public static void main(String[] args) {

        Queue<String> waitingQueue = new LinkedList<>();

        waitingQueue.add("Роман");
        waitingQueue.add("Мария");
        waitingQueue.add("Иван");
        waitingQueue.add("Катя");
        waitingQueue.add("Сергей");

        System.out.println("Очередь ожидания: " + waitingQueue);

        String name = waitingQueue.remove();
        System.out.println("Удален из очереди ожидания: " + name + " | Новая очередь ожидания: " + waitingQueue);

        waitingQueue.add("Вася");
        System.out.println("Очередь ожидания с новым клиентом: " + waitingQueue);
        
        name = waitingQueue.poll();
        System.out.println("Удален из очереди ожидания: " + name + " | Новая очередь ожидания : " + waitingQueue);

        String firstPersonInTheWaitingQueue = waitingQueue.element();
        System.out.println("Первый человек в очереди ожидания: " + firstPersonInTheWaitingQueue);

    }
}