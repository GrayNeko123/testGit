package com.example.testVer1;

import com.example.testVer1.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestVer1ApplicationTests {
	@Autowired
	TestService testService;

	@Test
	void contextLoads() {
	}

	@Test
	void testAnnotation() throws NoSuchFieldException {
		testService.test();
	}

}
