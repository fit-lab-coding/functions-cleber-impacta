package fit.core;

import java.util.function.Function;

public class FuncLogger {

	public static Function<String, String> create(String prefix) {
		 return loggerBuilder(prefix);
	}
	
    private static Function<String, String> loggerBuilder(String prefix) {
        return str -> {
            var text = String.format("%s %s", prefix, str);
            System.out.println(text);

            return text;
        };
    }
}
