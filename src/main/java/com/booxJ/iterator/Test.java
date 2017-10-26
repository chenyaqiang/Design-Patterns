package com.booxJ.iterator;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:45
 * @see:
 * @since:
 */
public class Test {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
