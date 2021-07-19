package BuileQueue;

import java.util.EmptyStackException;

public class Queue {
    public Node front;
    public Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
            front.link = rear;
            rear.link = front;
        } else {
            rear.link = newNode;
            newNode.link = front;
            rear = newNode;
        }
    }

    public void deQueue() {
        if (front == null) {
            throw new EmptyStackException();
        } else {
            if (front == rear) {
                front = rear = null;
            } else {
                front = front.link;
                rear.link = front;
            }

        }
    }

}
