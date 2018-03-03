package com.spike.argumentparser;

import com.spike.argumentparser.argument.Argument;
import com.spike.argumentparser.argumentBuilder.ArgumentBuilder;

import java.util.HashMap;

import static java.util.Arrays.asList;

public class Schema {

    private HashMap<Character, ArgumentBuilder> flags = new HashMap<>();

    public Schema(ArgumentBuilder... argumentBuilders) {
        asList(argumentBuilders).forEach(builder -> flags.put(builder.flag(), builder));
    }

    public Argument argumentFor(char flag, String value) {
        ArgumentBuilder argumentBuilder = flags.get(flag);
        return argumentBuilder.withValue(value).build();
    }
}
