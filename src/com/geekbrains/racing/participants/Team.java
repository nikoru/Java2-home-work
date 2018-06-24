package com.geekbrains.racing.participants;

public class Team implements Participant {
   String name;
   Participant[] team = new Participant[4];

   public Team(String  name, Participant participant1, Participant participant2, Participant participant3, Participant participant4){
       this.name = name;
       this.team[0] = participant1;
       this.team[1] = participant2;
       this.team[2] = participant3;
       this.team[3] = participant4;
   }


    @Override
    public void run(int distance) {
       for (Participant t:team)
           t.run(distance);
    }

    @Override
    public void jump(int height) {
        for (Participant t:team)
            t.jump(height);
    }


    @Override
    public void swim(int distance) {
        for (Participant t:team)
            t.swim(distance);
    }

    @Override
    public boolean isOnDistance() {
        for (Participant t:team){
            if (!t.isOnDistance()) return false;
        }
        return true;
    }

    @Override
    public void info() {
        for (Participant t:team)
            t.info();
    }

    public void showResults(){
        for (Participant t:team)
            if (t.isOnDistance()) t.info();
    }
}
