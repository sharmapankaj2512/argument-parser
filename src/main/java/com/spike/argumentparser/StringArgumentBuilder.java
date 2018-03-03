package com.spike.argumentparser;

public class StringArgumentBuilder implements ArgumentBuilder {
    private final Character flag;
    private final String description;
    private String value;

    public StringArgumentBuilder(Character flag, String description) {
        this.flag = flag;
        this.description = description;
    }

    @Override
    public ArgumentBuilder withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public Argument build() {
        return new StringArgument(flag, description, value);
    }

    @Override
    public Character flag() {
        return flag;
    }

    public static StringArgumentBuilder of(Character flag, String description) {
        return new StringArgumentBuilder(flag, description);
    }
}
