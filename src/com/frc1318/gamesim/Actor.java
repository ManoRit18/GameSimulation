package com.frc1318.gamesim;

public class Actor {
    private final String name;

    protected Actor(String name){
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public static class Builder {
        protected String name;
        public Builder(){

        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Actor build(){
            return new Actor(this.name);
        }
    }
}
