
import java.util.concurrent.*;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

interface Movable {
    void move();
}

class Dog extends Animal implements Movable {
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving");
    }
}

interface GenericInterface<T> {
    void performAction(T param);
}

class ConcreteClass implements GenericInterface<String> {
    @Override
    public void performAction(String param) {
        System.out.println("Performing action with: " + param);
    }
}

public class Lab4 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task = () -> {
            System.out.println("Task executed by thread: " + Thread.currentThread().getName());
        };

        executorService.submit(task);
        executorService.shutdown();

        Dog dog = new Dog();
        dog.sound();
        dog.move();
        Class<?> dogClass = dog.getClass();
        System.out.println("Superclass of Dog: " + dogClass.getSuperclass().getName());
        
        Class<?>[] interfaces = dogClass.getInterfaces();
        System.out.println("Implemented interfaces by Dog:");
        for (Class<?> i : interfaces) {
            System.out.println(i.getName());
        }

        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.performAction("Barking sound");

        try {
            Object x = "This is a string";
            Integer y = (Integer) x;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: Cannot cast a String to an Integer.");
        }
    }
}
