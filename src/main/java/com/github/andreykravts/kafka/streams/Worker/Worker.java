package com.github.andreykravts.kafka.streams.Worker;
//if you want set only one abstract method in this interface use @FunctionalInterface
@FunctionalInterface
public interface Worker {
    String work(int count);
}
