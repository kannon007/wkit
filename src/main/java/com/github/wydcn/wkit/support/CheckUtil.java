package com.github.wydcn.wkit.support;

public class CheckUtil {
    static class Str {
        public static boolean IsBlank(String str) {
            if(str == null
                    || str.trim().length()<1) {
                return true;
            }
            return false;
        }
    }
}
