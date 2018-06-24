package com.geekbrains.racing.obstacles;

import com.geekbrains.racing.participants.Animal;
import com.geekbrains.racing.participants.Participant;

public class Cross extends Obstacle {
    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant p) {
        p.run(length);
    }
}
