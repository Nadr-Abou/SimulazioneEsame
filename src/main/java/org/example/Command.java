package org.example;

import com.google.gson.Gson;

public class Command {
    String cmd;

    public Command fromMethod(String s){
        Gson g = new Gson();
        Command recived = g.fromJson(s,Command.class);
        return recived;
    }

    //{"cmd":"all"}
    //{"cmd":"more_expensive"}
    //{"cmd":"all_sorted"}
}
