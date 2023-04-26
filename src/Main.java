import entity.Animal;
import service.FeedAnimal;

import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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

//        ScheduledExecutorService executorService = null;
//
//        executorService = Executors.newScheduledThreadPool(3);
//        Thread threadFeed = new Thread(new FeedAnimal(animalArrayList));
//
//        executorService.scheduleAtFixedRate(animalArrayList, 0, 3, TimeUnit.MINUTES);
//        executorService.shutdown();
//
//        try {
//            executorService.awaitTermination(6, TimeUnit.MINUTES);
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }

        Timer timer = new Timer();
        timer.schedule(new FeedAnimal(animalArrayList), 0, 1800);
        System.out.println("By.........");
    }
}