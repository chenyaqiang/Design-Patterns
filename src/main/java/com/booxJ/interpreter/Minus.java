package com.booxJ.interpreter;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 14:21
 * @see:
 * @since:
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }

}
