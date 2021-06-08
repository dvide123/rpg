package com.company;

public class character {
    private String Name;
    private String CLASS;
    private String Race;
    private atributs atributs = new atributs();


    @Override
    public String toString() {
        return "Character{" +
                "Name='" + Name + '\'' +
                ", CLASS='" + CLASS + '\'' +
                ", Race='" + Race + '\'' +
                '}';
    }

    public atributs getatributs() {
        return atributs;
    }

    public character(String Name, String CLASS, String Race) {
        this.Name = Name;
        this.CLASS = CLASS;
        this.Race = Race;
    }

    public String getName() {
        return Name;
    }

    public String getCLASS() {
        return CLASS;
    }

    public String getRace() {
        return Race;
    }

}
