package com.github.andreykravts.kafka.streams.Main;


import com.github.andreykravts.kafka.streams.Predicate.Predicate;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("THREAD");
//            }
//        }).start();
//
//        new Thread(() -> System.out.println("LAMBDA")).start();
//        new Thread(() -> {
//            System.out.println("LAMBDA");
//            System.out.println("More then one action");
//            System.out.println("use curly braces");
//        }).start();



//        Director director = new Director();
//        director.makeWorkerWork(new Worker() {
//            @Override
//            public void work() {
//                System.out.println("Working..");
//            }
//        });
//        director.force(() -> System.out.println("working....");


//        String result = director.force((int n) -> {
//            for (int i = 0; i < n; i++) {
//                System.out.println("Working...");
//            }
//            return "Success";
//
//        },5);
//        // 5 is n
//
//
//        Worker worker = (int n) -> {
//            for (int i = 0; i < n; i++) {
//                System.out.println("Working...");
//            }
//            return "Success";
//        };



        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<100; i++){
            numbers.add((int)(Math.random()*1000)); // numbers from 1 to 1000
        }
        //List<Integer> filtred = filter(numbers);


//        List<Integer> filtred = filter(numbers,(a) -> {
//            boolean numberCheckResult = false;
//            if (a % 2 == 0)
//            {numberCheckResult = true;}
//            return numberCheckResult;}
//        );


//        List<Integer> filtred = filter(numbers, new Predicate() {
//            @Override
//            public boolean test(int a) {
//                return a%2==0;
//            }
//        });

        List<Integer> filtred = filter(numbers,(a) -> a%2==0);
        //(a) -> a%2==0
        //(a) number,predicate
        //a%2==0 its realization that we're going to store into boolean method predicate.test(i)

        for(int i : filtred){
            System.out.println(i);
        }

    }

//        private static List<Integer> filter2(List<Integer> list){
//            List<Integer> result = new ArrayList<>();
//            for(int i : list) {
//                if (i % 2 == 0) {
//                    result.add(i);
//                }
//            }
//            return result;
//        }


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

//    predicate.test((int i) -> {boolean numberCheckResult = false; if (i % 2 == 0) {numberCheckResult = true;} return numberCheckResult;}, a);
