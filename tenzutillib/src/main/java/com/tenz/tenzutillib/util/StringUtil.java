package com.tenz.tenzutillib.util;

/**
 * 字符串工具类
 */
public class StringUtil {

    /**
     * 判断字符串是否为空
     * @param content
     * @return
     */
    public static boolean isEmpty(String content){
        boolean isEmpty = false;
        if(null == content || "".equals(content)){
            isEmpty = true;
        }
        return isEmpty;
    }

}
