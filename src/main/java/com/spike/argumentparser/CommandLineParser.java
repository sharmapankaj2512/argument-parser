package com.spike.argumentparser;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandLineParser {
    private Schema schema;

    public CommandLineParser(Schema schema) {
        this.schema = schema;
    }

    public List<Argument> parse(String flags) {
        Pattern p1 = Pattern.compile("-(\\w)");
        Matcher m = p1.matcher(flags);
        if (m.matches()) {
            String flag = m.group(1);
            return Collections.singletonList(schema.argumentFor(flag.charAt(0)));
        }
        return null;
    }
}
