package org.boilerplate.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

//    private static final Logger LOGGER = LogManager.getLogger(GreetingController.class);

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestHeader HttpHeaders httpHeaders) {
//        httpHeaders.forEach((key, value) -> value.forEach(LOGGER::info));

        return new Greeting(counter.incrementAndGet(), "Greetings!");
    }
}
