package com.spike.argumentparser.argumentBuilder;

import com.spike.argumentparser.argument.Argument;

public interface ArgumentBuilder {
    Argument build();

    Character flag();

    ArgumentBuilder withValue(String value);
}
