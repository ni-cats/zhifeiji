package com.zhifeiji.image.common.enums;

import org.apache.ibatis.annotations.One;

/**
 * 魔数
 */
public enum Magic {
    ONE(1),
    TWO(2);

    private final int code;

    Magic(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    // 可选：从字符串值获取枚举常量
    public static Magic fromCode(int code) {
        for (Magic magic : values()) {
            if (code == magic.code) {
                return magic;
            }
        }
        throw new IllegalArgumentException("Invalid Magic code: " + code);
    }
}
