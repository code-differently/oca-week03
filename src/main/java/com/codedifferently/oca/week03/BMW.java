package com.codedifferently.oca.week03;
import java.util.Date;




public class BMW implements Vehicle{
    private static String brand;
    private String model;
    private Date date;

    @Override
    public float move(float distance) {
        return distance;


    }

    @Override
    public void changeDirection(String direction) {

    }


    @Override
    public void stop() {

    }

    @Override
    public void accelerate(float speed) {

    }

    @Override
    public void decelerate(float speed) {

    }
}
