package com.codenotfound.kafka.producers;

import com.codenotfound.kafka.producer.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(JUnit4.class)
@SpringBootTest
public class SenderTest {

    @Autowired(required = true)
    public Sender sender;

    @Test
    public void senderTest() {
        User user = User.newBuilder()
                .setFavoriteColor("Red")
                .setName("Gabriel")
                .setFavoriteNumber(2)
                .build();

        System.out.println(sender);

        sender.send(user);

    }
}

