package com.github.andreykravts.kafka.streams.Director;

import com.github.andreykravts.kafka.streams.Worker.Worker;

public class Director {
    public String force(Worker worker, int count){
        return worker.work(count);
    }
}
