package com.codenotfound.kafka.serializer;

import static org.assertj.core.api.Assertions.assertThat;

import javax.xml.bind.DatatypeConverter;

import example.avro.User;
import org.junit.Test;

public class AvroSerializerTest {

  @Test
  public void testSerialize() {
    User user = User.newBuilder().setName("John Doe").setFavoriteColor("green")
        .setFavoriteNumber(null).build();

    AvroSerializer<User> avroSerializer = new AvroSerializer<>();
    assertThat(avroSerializer.serialize("avro.t", user))
        .isEqualTo(DatatypeConverter.parseHexBinary("104A6F686E20446F6502000A677265656E"));

    avroSerializer.close();
  }
}
