package com.github.andreykravts.kafka.streams.Main;


import java.util.ArrayList;
import java.util.List;
//import java.util.function.Function;
//import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<100; i++){
            numbers.add((int)(Math.random()*1000)); // numbers from 1 to 1000
        }


        //list is the destination collection for our stream of data
        List<String> list = numbers.stream()
                //start with a filter number collection, only numbers that can be divided by two without a remainder
                .filter((n) ->n%2==0)
                //map is doing copy of data and transform, here we create a string for every element
                .map((integer) -> "Number: "+ integer)
                //here we filter too, but now we want strings that ends with "0"
                .filter((string)-> string.endsWith("0"))
                //with that map we change our strings another time by adding a "!"
                .map((string) -> string+"!")
                //method collect put this data on the destination list
                //also this method called terminated
                //stream data into a collection
                .collect(Collectors.toList());
        //print a new list
        for(String s: list){
            System.out.println(s);
        }

    }

}
