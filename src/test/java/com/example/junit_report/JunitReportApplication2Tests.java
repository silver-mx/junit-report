package com.example.junit_report;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitReportApplication2Tests {

    @Test
    void contextLoadsSleep() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test
    void contextLoadsFails() throws InterruptedException {
        Assertions.fail("Test failed");
    }

}
