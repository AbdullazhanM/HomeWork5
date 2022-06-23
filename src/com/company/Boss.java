package com.company;

public class Boss {
    private int bossHealth;
    private int bossAttack;
    private String bossDefence;


    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossAttack() {
        return bossAttack;
    }

    public void setBossAttack(int bossAttack) {
        this.bossAttack = bossAttack;
    }

    public String getBossDefence() {
        return bossDefence;
    }

    public void setBossDefence(String bossDefence) {
        this.bossDefence = bossDefence;
    }

    public Boss(int bossHealth, int bossAttack, String bossDefence) {
        this.bossHealth = bossHealth;
        this.bossAttack = bossAttack;
        this.bossDefence = bossDefence;
    }




    }

