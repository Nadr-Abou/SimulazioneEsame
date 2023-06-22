package org.example;

import com.google.gson.Gson;

import java.util.List;

public class Answer {
    boolean result;
    String msg;
    List<Car> cars;
    Car car;

    public Answer(boolean result, List<Car> cars) {
        this.result = result;
        this.cars = cars;
    }

    public Answer(boolean result, String msg) {
        this.result = result;
        this.msg = msg;
    }

    public Answer(boolean result, Car car) {
        this.result = result;
        this.car = car;
    }


    public String answerJSON(){
        Gson g = new Gson();
        String s = g.toJson(this);
        return s;
    }
}
