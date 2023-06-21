package org.example;

import com.google.gson.Gson;

import java.util.List;

public class Answer {
    boolean result;
    String msg;
    List<Car> cars;

    public Answer(boolean result, List<Car> cars) {
        this.result = result;
        this.cars = cars;
    }

    public Answer(boolean result, String msg) {
        this.result = result;
        this.msg = msg;
        this.cars = cars;
    }


    public String answerJSON(){
        Gson g = new Gson();
        String s = g.toJson(this);
        return s;
    }
}
