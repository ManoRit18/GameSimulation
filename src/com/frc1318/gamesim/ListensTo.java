package com.frc1318.gamesim;

public class ListensTo {
    private final Actor actor;

    private ListensTo(Actor actor){

        this.actor = actor;
    }

    public static class Builder {
        private Actor actor;
        public Builder(){

        }
        public Builder setActor(Actor actor){
            this.actor = actor;
            return this;
        }
        public ListensTo build(){

            return new ListensTo(actor);
        }
    }
}
