package com.github.wydcn.wkit.support;

public class RandomUtil {
    private static int index = 0;
    private static Object lock = new Object();
    public static  String genIdKey() {
        synchronized (lock){
            index = (index+1)%10;
        }
        long curTime = System.nanoTime();
        String str = Long.toString(curTime,32);
        str = str+Integer.toString(index,32);
        return str;
    }
}
