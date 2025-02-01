package org.yascode.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class MainApplication {
    public static void main(String[] args) {
        /*
        * ArrayDeque is a first-in-first-out (FIFO) queue.
        * */
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("task 1");
        arrayDeque.add("task 2");
        arrayDeque.add("task 3");
        arrayDeque.add("task 4");

        ArrayDeque<String> stringArrayDeque = new ArrayDeque<>();
        stringArrayDeque.add("task 2");
        stringArrayDeque.add("task 4");
        stringArrayDeque.add("task 6");

        arrayDeque.retainAll(stringArrayDeque);

        /*
        * Priority Queue is a queue that stores elements in a specific order based on their priority.
        * The element with the highest priority will be the first to be removed.
        * */
        PriorityQueue<Task> tasks = new PriorityQueue<>();
        tasks.add(new Task("task 3", 3));
        tasks.add(new Task("task 1", 1));
        tasks.add(new Task("task 2", 2));

    }

    static class Task implements Comparable<Task> {
        String name;
        int priority;

        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Task o) {
            return Integer.compare(this.priority, o.priority);
        }
    }
}
