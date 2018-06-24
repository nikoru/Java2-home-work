package com.geekbrains.racing.obstacles;

import com.geekbrains.racing.participants.Animal;
import com.geekbrains.racing.participants.Participant;

public class Water extends Obstacle {
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant p) {
        p.swim(distance);
    }
}
