package com.shenfeng.yxw.enums;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yangxiaowei37
 * @Date: 27/8/2021 上午10:15
 * @Version: 1.0
 * @Description:
 */
@Slf4j
public enum TestEnum {
    TEST("1");

    TestEnum(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
