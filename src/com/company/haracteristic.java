package com.company;

public class haracteristic {
    public int damage;
    public int mp ;
    public int sp;
    public int hp;


    public void setHuman() {
        damage = 10;
        hp = 50;
        mp = 50;
        sp = 50;
    }

    public void setElf() {
        damage = 10;
        hp = 30;
        mp = 80;
        sp = 40;
    }

    public void setOrc() {
        damage = 15;
        hp = 60;
        mp = 30;
        sp = 60;
    }
}
