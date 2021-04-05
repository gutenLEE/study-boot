package com.study.springboot.studyboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@SpringBootTest
public class Test {

    @Autowired
    PropTest propTest;

    @org.junit.jupiter.api.Test
    public void test() {

        System.out.println("properties 값은 ==> " + propTest.getKey());
    }
}
