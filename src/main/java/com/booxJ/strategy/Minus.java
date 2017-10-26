package com.booxJ.strategy;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:25
 * @see:
 * @since:
 */
public class Minus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "-");
        return arrayInt[0] - arrayInt[1];
    }
}
