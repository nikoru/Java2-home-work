package com.geekbrains.racing.obstacles;

import com.geekbrains.racing.participants.Team;

public class Course{
    Obstacle[] obstacles;

    public Course(Obstacle... obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        for (Obstacle obstacle:obstacles){
            obstacle.doIt(team);
        }
    }
}
