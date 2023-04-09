package io.github.robin_code.util;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalDateTimeUtilTest {

    @Test
    void toDateTimeString() {
        LocalDateTime localDateTime = LocalDateTime.of(2019, 1, 1, 0, 0, 0);
        String dateTimeString = LocalDateTimeUtil.toDateTimeString(localDateTime);
        assertEquals("2019-01-01 00:00:00", dateTimeString);
    }
}