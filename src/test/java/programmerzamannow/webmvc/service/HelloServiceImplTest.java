package programmerzamannow.webmvc.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloServiceImplTest {

    @Autowired
    private HelloService helloService;

    @Test
    void hello() {
        assertEquals("Hello Guest", helloService.hello(null));
        assertEquals("Hello Aidil", helloService.hello("Aidil"));
    }
}