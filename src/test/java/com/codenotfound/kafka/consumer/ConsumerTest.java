package com.codenotfound.kafka.consumer;

import org.junit.Test;

public class ConsumerTest {

    @Test
    public void consumerTest() {
        User user = User.newBuilder()
                .setFavoriteColor("Red")
                .setName("Gabriel")
                .setFavoriteNumber(2)
                .build();

        Receiver receiver = new Receiver();
        receiver.receive(user);

    }
}
