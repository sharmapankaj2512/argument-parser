package com.spike.argumentparser.argument;

import java.util.Objects;

public class BooleanArgument implements Argument<Boolean> {
    private final char flag;
    private final String shortHand;

    public BooleanArgument(char flag, String description) {
        this.flag = flag;
        this.shortHand = description;
    }

    @Override
    public Boolean value() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BooleanArgument that = (BooleanArgument) o;
        return Objects.equals(flag, that.flag) &&
                Objects.equals(shortHand, that.shortHand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flag, shortHand);
    }
}
