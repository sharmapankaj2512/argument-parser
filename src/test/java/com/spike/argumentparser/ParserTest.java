package com.spike.argumentparser;

import com.spike.argumentparser.argument.Argument;
import com.spike.argumentparser.argument.BooleanArgument;
import com.spike.argumentparser.argument.StringArgument;
import com.spike.argumentparser.argumentBuilder.BooleanArgumentBuilder;
import com.spike.argumentparser.argumentBuilder.StringArgumentBuilder;
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

    @Test
    public void shouldBeAbleToParseAStringFlag() {
        //GIVEN
        Schema schema = new Schema(StringArgumentBuilder.of('d', "directory"));

        CommandLineParser parser = new CommandLineParser(schema);

        //WHEN
        List<Argument> arguments = parser.parse("-d /usr/temp");

        //THEN
        assertThat(arguments).isEqualTo(singletonList(new StringArgument('d', "directory", "/usr/temp")));
    }
}
