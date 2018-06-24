package com.geekbrains.racing.obstacles;

import com.geekbrains.racing.participants.Animal;
import com.geekbrains.racing.participants.Participant;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant p) {
        p.jump(height);
    }
}
