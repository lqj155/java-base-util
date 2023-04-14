package io.github.robin_code.util;

import java.time.LocalDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class LocalDateTimeUtilTest {

    @Test
    void toDateTimeString() {
        LocalDateTime localDateTime = LocalDateTime.of(2019, 1, 1, 0, 0, 0);
        String dateTimeString = LocalDateTimeUtil.toDateTimeString(localDateTime);
        Assertions.assertThat(dateTimeString).isEqualTo("2019-01-01 00:00:00");
    }

    @Test
    void currentDateTime() {
        LocalDateTime now = LocalDateTime.of(2023, 2, 13, 1, 1, 1, 99999);
        LocalDateTime expect = LocalDateTime.of(2023, 2, 13, 1, 1, 1);
        try (MockedStatic<LocalDateTime> topDateTimeUtilMock = Mockito.mockStatic(LocalDateTime.class)) {
            topDateTimeUtilMock.when(LocalDateTime::now).thenReturn(now);
            LocalDateTime dateTime = LocalDateTimeUtil.currentDateTime();
            Assertions.assertThat(dateTime).isEqualTo(expect);
        }
    }
}