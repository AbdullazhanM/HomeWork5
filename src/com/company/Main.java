package com.company;

public class Main {
public static String[] heroes = {"Archer", "Magi", "Tank"};

    public static void main(String[] args) {
        Boss slug = new Boss(500, 50, "slime");

        System.out.println("'Biggest Slug' " + "-Attack [" + slug.getBossAttack() + "]" + " -Defence Type[" + slug.getBossDefence() + "] -Health[" + slug.getBossHealth() + "]");

            }
}

