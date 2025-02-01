package org.yascode.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MainApplication {

    public static void main(String[] args) {
        Comparator<? super Task> comparator = Comparator.comparingInt((Task o) -> o.priority);
        Map<Task, String> codes = new TreeMap<>(comparator);
        codes.put(new Task(3, "Three"), "Three");
        codes.put(new Task(1, "One"), "One");
        codes.put(new Task(2, "Two"), "Two");

        for (String value : codes.values()) {
            System.out.println(value);
        }
    }

    public static class Task {
        int priority;
        String name;

        public Task(int priority, String name) {
            this.priority = priority;
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
