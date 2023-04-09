package io.github.robin_code.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import io.github.robin_code.constant.BaseConstant;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LocalDateTimeUtil {

    private static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static String toDateTimeString(LocalDateTime localDateTime) {
        if (Objects.isNull(localDateTime)) {
            return BaseConstant.EMPTY;
        }
        return localDateTime.format(DateTimeFormatter.ofPattern(DEFAULT_DATE_PATTERN));
    }
}
