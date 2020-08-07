package com.itheima.queue;

public class TestCirculeQueue {
    public static void main(String[] args) {
        CirculiQueue queue = new CirculiQueue(5);
        System.out.println(queue.dequeue());
        //入队列
        System.out.println(queue.enqueue("itcast1"));
        System.out.println(queue.enqueue("itcast2"));
        System.out.println(queue.enqueue("itcast3"));
        System.out.println(queue.dequeue());
        System.out.println(queue.enqueue("itcast4"));
        System.out.println(queue.enqueue("itcast5"));
        System.out.println(queue.enqueue("itcast6"));
        System.out.println(queue.enqueue("itcast7"));
        System.out.println(queue.enqueue("itcast8"));
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
