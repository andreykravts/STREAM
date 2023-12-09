package com.github.andreykravts.kafka.streams.Main;


import com.github.andreykravts.kafka.streams.Predicate.Predicate;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<100; i++){
            numbers.add((int)(Math.random()*1000)); // numbers from 1 to 1000
        }
        //filter
        List<Integer> filtred = filter(numbers,(a) -> a%2==0);
        //change type of collection
        List<String> mapped = map(filtred);

//        for(int i : filtred){
//            System.out.println(i);
//        }


        for(String i : mapped){
            System.out.println(i);
        }

    }
    //make from an integer collection is the String collection
    private static List<String> map(List<Integer> numbers){
        List<String> result = new ArrayList<>();
        for(int number : numbers){
            result.add("Number: "+number);
        }
        return result;
    }

    private static List<Integer> filter(List<Integer> list, Predicate predicate){
        List<Integer> result = new ArrayList<>();
        for(int i : list) {
            if(predicate.test(i)){
                result.add(i);
            }
        }
        return result;
    }
}
