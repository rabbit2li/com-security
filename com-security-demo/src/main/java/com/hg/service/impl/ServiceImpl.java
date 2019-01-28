package com.hg.service.impl;

import com.hg.service.ServiceTest;
import org.springframework.stereotype.Service;

/**
 * @auther kim
 * @date 2019/1/25
 */
@Service
public class ServiceImpl implements ServiceTest {

    @Override
    public String hello(String name) {
        System.out.println("hello valid...");
        return "hi " + name;
    }
}
