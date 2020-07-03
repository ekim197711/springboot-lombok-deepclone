package com.example.demo.space;

public class MyProgramUsingLombok {
    public static void main(String[] args) throws CloneNotSupportedException {
        SpaceShip spaceShip = new SpaceShip("Round", 88, new Captain("Mike", 5));
        SpaceShip clone = spaceShip.toBuilder()
                .captain(spaceShip.getCaptain().toBuilder().build())
                .build();
        System.out.println(clone);
        spaceShip.getCaptain().setName("Something else... ");
        System.out.println(clone);
        System.out.println("original: " + spaceShip);
    }
}
