package Queue;

import java.util.EmptyStackException;

public class MylinkedlistQueue {
    Node head;
    Node tail;

    public MylinkedlistQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            head = tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
    }

    public Node dequeue() {
        if (head == null) {
            throw new EmptyStackException();
        }
        Node temp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return temp;
    }
}

class Node {
    public int key;
    public Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }
}

class Main {
    public static void main(String[] args) {
        MylinkedlistQueue queue = new MylinkedlistQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);

    }
}