package com.booxJ.mediator;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 14:17
 * @see:
 * @since:
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();

}
