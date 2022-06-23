package com.company;

public class Hero {
    private int healthOfHero;
    private int heroAttack;
    private String heroSuperAttack;


    public Hero(int healthOfHero, int heroAttack, String heroSuperAttack) {
        this.healthOfHero = healthOfHero;
        this.heroAttack = heroAttack;
        this.heroSuperAttack = heroSuperAttack;


    }

    public int getHealthOfHero() {
        return healthOfHero;
    }

    public int getHeroAttack() {
        return heroAttack;
    }

    public String getHeroSuperAttack() {
        return heroSuperAttack;
    }

    public Hero(int healthOfHero, int heroAttack) {
        this.healthOfHero = healthOfHero;
        this.heroAttack = heroAttack;
    }

}


