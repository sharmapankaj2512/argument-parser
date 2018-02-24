package com.spike.argumentparser;

import java.util.HashMap;

import static java.util.Arrays.asList;

public class Schema {

    private HashMap<Character, ArgumentBuilder> flags = new HashMap<>();

    public Schema(BooleanArgumentBuilder ...argumentBuilders) {
        asList(argumentBuilders).forEach(builder -> flags.put(builder.flag(), builder));
    }

    public Argument argumentFor(char flag) {
        ArgumentBuilder argumentBuilder = flags.get(flag);
        if (argumentBuilder instanceof BooleanArgumentBuilder) {
            return argumentBuilder.build();
        }
        return null;
    }
}
