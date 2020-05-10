package com.fierceq.stream.concat;

import com.fierceq.stream.pojo.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ConcatLists
 */
public class ConcatListsDemo {
    public static void main(String[] args) {
        List<Book> list1 = new ArrayList<>();
        List<Book> list2 = new ArrayList<>();
        {
            list1.add(new Book("Core Java", 200));
            list1.add(new Book("Spring MVC", 300));
            list1.add(new Book("Learning Freemarker", 150));

            list2.add(new Book("Core Java", 200));
            list2.add(new Book("Spring MVC", 300));
            list2.add(new Book("Learning Hibernate", 400));
        }
        List<Book> list = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        list.forEach(b -> System.out.println(b.getName() + ", " + b.getPrice()));

        //Remove duplicates using distinct()
        System.out.println("--Remove duplicates using distinct()--");
        list = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
        list.forEach(b -> System.out.println(b.getName() + ", " + b.getPrice()));
    }
}