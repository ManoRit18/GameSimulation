package com.frc1318.gamesim;

public class ScoreKeeper extends CompositeActor {
    private final Alliance alliance;


    protected ScoreKeeper(String name, Alliance alliance) {
        super(name);
        this.alliance = alliance;


    }
    public static class Builder extends CompositeActor.Builder {
        private Alliance alliance;
        public Builder(){


        }
        public Builder setAlliance(Alliance alliance){
            this.alliance = alliance;
            return this;
    }
        public ScoreKeeper build(){

            return new ScoreKeeper(name, alliance);
        }
    }
}
