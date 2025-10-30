package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise {
    public static Queue<String> createQueue() {
        Queue<String> Surname = new LinkedList<>();

        Surname.add("Smith");
        Surname.add("Montessori");
        Surname.add("Peralta");
        Surname.add("House");

        return Surname;

    }

    public static void printAndEmptyQueue(Queue<String> queue) {
        System.out.println("Al inicio de la cola: " + queue.peek());

        while (!queue.isEmpty()) {
           String Surname = queue.poll();
           System.out.println("Procesando y eliminando: " + Surname);
        }

        System.out.println("Cola vacía: " + queue.isEmpty());



    }
    public static void main(String[] args) {
        Queue<String> surname = createQueue();
        printAndEmptyQueue(surname);

    }

}
