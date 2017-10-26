package com.booxJ.strategy;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:21
 * @see:
 * @since:
 */
public abstract class AbstractCalculator {

    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }

}
