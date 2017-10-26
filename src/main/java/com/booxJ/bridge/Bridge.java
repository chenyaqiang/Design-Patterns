package com.booxJ.bridge;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:04
 * @see:
 * @since:
 */
public abstract class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
