package com.zhifeiji.image.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用返回结果类 服务端返回结果都会封装成此对象
 */

@Data
public class R<T> {

    private Integer code; //编码：0成功，其它数字为失败

    private String msg; //错误信息

    private T data; //数据

    private Map map = new HashMap(); //动态数据

    public static <T> R<T> success(T object) {
        R<T> r = new R<T>();
        r.code = 0;
        r.msg = "success";
        r.data = object;
        return r;
    }

    public static <T> R<T> error(String msg) {
        R r = new R();
        r.code = 50000;
        r.msg = msg;
        return r;
    }

    public R<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }

}
