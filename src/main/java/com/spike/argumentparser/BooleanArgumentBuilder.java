package com.spike.argumentparser;

public class BooleanArgumentBuilder implements ArgumentBuilder {
    private final char flag;
    private final String description;

    public BooleanArgumentBuilder(char flag, String description) {
        this.flag = flag;
        this.description = description;
    }

    @Override
    public ArgumentBuilder withValue(String value) {
        return this;
    }

    @Override
    public Character flag() {
        return flag;
    }

    @Override
    public Argument build() {
        return new BooleanArgument(flag, description);
    }

    public static BooleanArgumentBuilder of(char flag, String description) {
        return new BooleanArgumentBuilder(flag, description);
    }
}
