package service;

import entity.Animal;
import java.util.ArrayList;
import java.util.TimerTask;

public class FeedAnimal implements  Runnable{
    ArrayList<Animal> animalArrayList;

    public FeedAnimal(ArrayList<Animal> animalArrayList) {
        this.animalArrayList = animalArrayList;
    }


    public void run() {
        for ( Animal an : animalArrayList ) {
            System.out.println(an.getName() + " is feed " + new java.util.Date());

        }
        System.out.println("++++++++++++++++++++++++++++++");
    }
}
