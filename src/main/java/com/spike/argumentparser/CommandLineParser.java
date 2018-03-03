package com.spike.argumentparser;

import com.spike.argumentparser.argument.Argument;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Collections.singletonList;

public class CommandLineParser {
    private Schema schema;

    public CommandLineParser(Schema schema) {
        this.schema = schema;
    }

    public List<Argument> parse(String flags) {
        Pattern p1 = Pattern.compile("-(\\w)\\s*(.*)");
        Matcher m = p1.matcher(flags);
        if (m.matches()) {
            String flag = m.group(1);
            String value = m.group(2);
            Argument argument = schema.argumentFor(flag.charAt(0), value);
            return singletonList(argument);
        }
        return null;
    }
}
