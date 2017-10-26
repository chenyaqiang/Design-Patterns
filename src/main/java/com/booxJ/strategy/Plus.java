package com.booxJ.strategy;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:22
 * @see:
 * @since:
 */
public class Plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
