package com.example.demo;

import com.example.demo.controller.DemoController;
import com.example.demo.pojo.Person;
import com.example.demo.pojo.Son;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class DemoApplicationTests {

    @Autowired
    private DemoController demoController;

    @Test
    public void testDemo() {
        String str = demoController.getString();

        System.out.println(str);
    }

    @Test
    public void testInt() {
//        int a = 0.5 + 1;

        Person person = new Person("tom", 20);
        Son son = new Son();

        System.out.println("================before");
        System.out.println(person + "\n" + son);
        System.out.println("================after");

        BeanUtils.copyProperties(person, son);

        System.out.println(person + "\n" + son);
    }

    @Test
    public void testReturn() {

        int num = 0;

        if (num == 0){
            for (int i = 0; i < 10; i++){
                for (int j = 0; j < 10; j++){
                    if (j == 0){
                        log.info("j====================" + j);
                        return;
                    }
                }
                log.info(i + "====================i");
            }
            log.info("结束===============");
        }

    }
}
