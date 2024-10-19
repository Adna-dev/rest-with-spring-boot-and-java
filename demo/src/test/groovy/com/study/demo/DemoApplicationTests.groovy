package com.study.demo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@Import(TestcontainersConfiguration)
@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

}
