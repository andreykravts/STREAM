package com.github.andreykravts.kafka.streams.Main;


import com.github.andreykravts.kafka.streams.User.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<User> users = new ArrayList<User>();
        users.add(new User("Max",23));
        users.add(new User("Valera",24));
        users.add(new User("Yossi",26));

        users.add(new User("Peps",28));
        users.add(new User("Ker",25));
        users.add(new User("B",24));

        users.add(new User("A",35));
        users.add(new User("H",56));
        users.add(new User("o",17));
        users.add(new User("C",70));

        long count = users.stream()
                .filter(User -> User.getAge() >30)
                .count();

        System.out.println(count);
        boolean result = users.stream()
                //all people matched
                .allMatch(User -> User.getAge()>16);

        System.out.println(result);

         result = users.stream()
                //all people no matched
                 //but if at least one is found get false
                .noneMatch(User -> User.getAge()<16);

        System.out.println(result);


        result = users.stream()
                //some people matched
                .anyMatch(User -> User.getAge()>18);

        System.out.println(result);



        List <User> resultList = users.stream()
                //sort users 01 user 1 o2 user 2 Integer Compare set 02.getAge()
                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
                .limit(3)
                        .collect(Collectors.toList());

        for(User user : resultList){
            System.out.println(user.toString());
        }


        users.stream()
                //sort users 01 user 1 o2 user 2 Integer Compare set 02.getAge()
                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
                .limit(3)
                //foreach terminal operator
                .forEach(user -> System.out.println(user));
        users.stream()
                //sort users 01 user 1 o2 user 2 Integer Compare set 02.getAge()
                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
                .limit(3)
                //foreach terminal operator
                .forEach(System.out::println);

        //to do sort users by their name in alphabetical order
        //only users that have age lower than 30
        //take 3 first users
        //save only names in new collection
        //use for each to print all names in the collection

//        List<Integer> numbers = new ArrayList<>();
//        for(int i = 0; i<1000; i++){
//            numbers.add((int)(Math.random()*100+100)); // numbers from 100 to 200
//        }
//
//
//        //list is the destination collection for our stream of data
//        List<String> list = numbers.stream()
//                .filter((n) ->n%2==0 && n%5==0)
//                //short
//                .mapToDouble(Math::sqrt)
//                //full
//                //.mapToDouble((number) -> Math.sqrt(number))
//                .mapToObj((number) -> "Square: "+ number)
//                .collect(Collectors.toList());
//        //print a new list
//        for(String s: list){
//            System.out.println(s);
//        }

    }

}
