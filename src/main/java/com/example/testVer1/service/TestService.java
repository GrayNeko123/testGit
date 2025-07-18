package com.example.testVer1.service;

import com.example.testVer1.annotation.TestAnnotation;
import com.example.testVer1.pojo.TestNode;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public void test() throws NoSuchFieldException {
        TestNode node = new TestNode("你老師");
        if(node.getClass().getDeclaredField("name").isAnnotationPresent(TestAnnotation.class)){
            TestAnnotation nameAnnotation = AnnotationUtils.getAnnotation(node.getClass().getDeclaredField("name"), TestAnnotation.class);
            assert nameAnnotation != null;
            System.out.println("name="+nameAnnotation.name());
            System.out.println("value="+nameAnnotation.value());
        }else {
            System.out.println("FQ");
        }
    }
}
