package com.company;

public class parameters {
    public Integer maxhp;
    public Integer maxmp;
    public String name;
    public Integer lvl;
    public Integer exp;

    public parameters(Integer maxhp, Integer maxmp, String name) {
        this.maxhp = maxhp;
        this.maxmp = maxmp;
        this.name = name;
    }

    public parameters(Integer lvl, Integer exp) {
        this.lvl = lvl;
        this.exp = exp;
    }
}
