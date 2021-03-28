package com.codedifferently.oca.week03;

public interface Vehicle {

        float move(float distance);
        void changeDirection(String direction);
        void stop();
        void accelerate(float speed);
        void decelerate (float speed);


    }
