package com.frc1318.gamesim;

import java.util.HashSet;
import java.util.Set;

public class CompositeActor extends Actor {
    private final Set<ListensTo> listensTo;

    protected CompositeActor(String name, Set<ListensTo> listensTo) {
        super(name);
        this.listensTo = listensTo; //Copy into immutable set
    }

    public static class Builder extends Actor.Builder {
        private Set<ListensTo> listensTo;
        public Builder(){

            listensTo = new HashSet<>();
        }
        public Builder addListensTo(ListensTo listensTo){
            this.listensTo.add(listensTo);
            return this;
        }
        public CompositeActor build(){

            return new CompositeActor(this.name, listensTo);
        }
    }
}
