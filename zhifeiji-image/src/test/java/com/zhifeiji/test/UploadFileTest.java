package com.zhifeiji.test;

import org.junit.jupiter.api.Test;

public class UploadFileTest {
    @Test
    public void test1() {
        String fileName = "qewfqergwrthwrth.png";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }
}
