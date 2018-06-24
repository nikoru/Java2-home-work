package com.geekbrains.racing;

import com.geekbrains.racing.obstacles.*;
import com.geekbrains.racing.participants.*;

public class MainClass {
    public static void main(String[] args) {

        Team team = new Team("DreamTeam", new Human("Bob"), new Cat("Barsik"), new Dog("Bobik"), new Human("Tim") );
        Course c = new Course(new Wall(80), new Cross(800), new Water(20), new Cross(500));
        c.doIt(team);
        team.showResults();


    }
}

