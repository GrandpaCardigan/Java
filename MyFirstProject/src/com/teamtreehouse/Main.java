package com.teamtreehouse;

import com.teamtreehouse.data.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Ben" );
        String name = person.getName();
        System.out.println(name);

    }
}
