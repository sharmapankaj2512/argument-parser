package com.spike.argumentparser;

import org.junit.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;
import static java.util.Collections.singletonList;

public class ParserTest {
    @Test
    public void shouldBeAbleToParseABooleanFlag() {
        //GIVEN
        Schema schema = new Schema(BooleanArgumentBuilder.of('l', "logging"));

        CommandLineParser parser = new CommandLineParser(schema);

        //WHEN
        List<Argument> arguments = parser.parse("-l");

        //THEN
        assertThat(arguments).isEqualTo(singletonList(new BooleanArgument('l', "logging")));
    }
}
