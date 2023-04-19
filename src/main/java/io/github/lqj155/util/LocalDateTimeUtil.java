package io.github.lqj155.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

import io.github.lqj155.constant.BaseConstant;
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

    /**
     * curren datetime remove milliseconds
     * 当前时间，舍去秒小数部分，防止四舍五入进位.
     */
    public static LocalDateTime currentDateTime() {
        return LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
    }
}
