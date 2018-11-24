package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {

    private final String names;
    private final String lastames;
    private final int age;

    public Person(String name, String lastnames, int age) {
        this.names = name;
        this.lastames = lastnames;
        this.age = age;
    }


    public Person(String name) {
        this.names = name;
        this.lastames = "";
        this.age = 0;
    }

    public Person() {
        this.names = "";
        this.lastames = "";
        this.age = 0;
    }

    public String getName() {
        return names;
    }

    public int getAge() {
        return age;
    }

    public String getLastames() {
        return lastames;
    }

}