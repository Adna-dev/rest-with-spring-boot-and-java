package com.study.demo

import org.springframework.boot.SpringApplication

class TestDemoApplication {

    static void main(String[] args) {
        SpringApplication.from(Startup::main).with(TestcontainersConfiguration).run(args)
    }

}
