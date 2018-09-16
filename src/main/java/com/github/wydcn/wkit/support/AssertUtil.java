package com.github.wydcn.wkit.support;


import com.github.wydcn.wkit.exception.WkitException;

import java.util.Collection;

public class AssertUtil {
    public static void NotBank(Object object,String msg) {
        if (object instanceof Iterable) {
            Collection list = (Collection) object;
            NotBankList(list,msg);
            return;
        }
        if (object instanceof String) {
            String str = (String) object;
            NotBankString(str,msg);
            return;
        }
    }

    public static void NotBankList(Collection list,String msg) {
        if (list == null
                || list.size() < 1) {
            throw new WkitException(msg);
        }
    }

    public static void NotBankString(String str,String msg) {
        if (CheckUtil.Str.IsBlank(str)) {
            throw new WkitException(msg);
        }
    }

    public static void Equal(String a,String b,String msg) {
        if (!a.equals(b)) {
            throw new WkitException(msg);
        }
    }
}
