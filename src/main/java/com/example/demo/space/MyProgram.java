package com.example.demo.space;

public class MyProgram {
    public static void main(String[] args) throws CloneNotSupportedException {
        SpaceShip spaceShip = new SpaceShip("Round", 88, new Captain("Mike", 5));
        SpaceShip clone = (SpaceShip) spaceShip.clone();
        System.out.println(clone);
        spaceShip.getCaptain().setName("Something else... ");
        System.out.println(clone);
        System.out.println("original: " + spaceShip);
    }
}
