package com.example.testVer1.pojo;

import com.example.testVer1.annotation.TestAnnotation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestNode {

    @TestAnnotation("2")
    private String name;
}
