package com.github.andreykravts.kafka.streams.Main;


import java.util.ArrayList;
import java.util.List;
//import java.util.function.Function;
//import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<1000; i++){
            numbers.add((int)(Math.random()*100+100)); // numbers from 100 to 200
        }


        //list is the destination collection for our stream of data
        List<String> list = numbers.stream()
                .filter((n) ->n%2==0 && n%5==0)
                //short
                .mapToDouble(Math::sqrt)
                //full
                //.mapToDouble((number) -> Math.sqrt(number))
                .mapToObj((number) -> "Square: "+ number)
                .collect(Collectors.toList());
        //print a new list
        for(String s: list){
            System.out.println(s);
        }

    }

}
