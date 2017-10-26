package com.booxJ.mediator;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 14:17
 * @see:
 * @since:
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
