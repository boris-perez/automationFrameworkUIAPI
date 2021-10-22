package application.config;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Boris Perez
 */
@Component
@Scope("prototype")
public class ValueGenerator {

    public static String numberGenerator(Integer size) {
        return RandomStringUtils.randomNumeric(size);
    }

    public static String numberLetterGenerator(Integer size) {
        return RandomStringUtils.randomAlphanumeric(size);
    }

    public String nextAsString() {
        return RandomStringUtils.randomAlphabetic(5);
    }

    public Integer nextInteger() {
        return RandomUtils.nextInt(0, Integer.MAX_VALUE);
    }

    public Integer nextUserId() {
        return RandomUtils.nextInt(0, 65);
    }

    public Long nexLong() {
        return RandomUtils.nextLong(0, Long.MAX_VALUE);
    }
}
