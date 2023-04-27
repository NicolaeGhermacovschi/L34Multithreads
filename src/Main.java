import entity.Animal;

import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! \nStart");
        ArrayList<Animal> animalArrayList = new ArrayList<>();

        animalArrayList.add(new Animal("Bear", 2));
        animalArrayList.add(new Animal("Camel", 2));
        animalArrayList.add(new Animal("Donkey", 2));
        animalArrayList.add(new Animal("Rabbit", 3));
        animalArrayList.add(new Animal("Zebra", 4));
        animalArrayList.add(new Animal("Dog", 5));
        animalArrayList.add(new Animal("Cat", 6));
        animalArrayList.add(new Animal("Fox", 10));
        animalArrayList.add(new Animal("Bear", 2));
        animalArrayList.add(new Animal("Camel", 2));
        animalArrayList.add(new Animal("Donkey", 2));
        animalArrayList.add(new Animal("Rabbit", 3));
        animalArrayList.add(new Animal("Zebra", 4));
        animalArrayList.add(new Animal("Dog", 5));
        animalArrayList.add(new Animal("Cat", 6));
        animalArrayList.add(new Animal("Fox", 10));

//        ExecutorService executors = Executors.newSingleThreadExecutor();
//
//        try {
//            executors.submit(() -> animalArrayList.stream().forEach(System.out::println));
//        } finally {
//            executors.shutdown();
//        }

        ScheduledExecutorService executors = Executors.newSingleThreadScheduledExecutor();

        try {
            executors.schedule(() -> animalArrayList.stream().forEach(System.out::println), 2000, TimeUnit.MILLISECONDS);
        } finally {
            executors.shutdown();
        }



//        Timer timer = new Timer();
//        timer.schedule(new FeedAnimal(animalArrayList), 0, 1800);
//        System.out.println("By.........");
    }
}