package com.spike.argumentparser.argument;

import java.util.Objects;

public class StringArgument implements Argument<String> {
    private final char flag;
    private final String description;
    private final String value;

    public StringArgument(char flag, String description, String value) {
        this.flag = flag;
        this.description = description;
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringArgument that = (StringArgument) o;
        return flag == that.flag &&
                Objects.equals(description, that.description) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flag, description, value);
    }
}
