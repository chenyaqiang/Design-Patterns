package com.booxJ.interpreter;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 14:20
 * @see:
 * @since:
 */
public class Plus implements Expression{
    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
