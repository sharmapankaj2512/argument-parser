package com.spike.argumentparser;

public interface ArgumentBuilder {
    Argument build();

    Character flag();

    ArgumentBuilder withValue(String value);
}
