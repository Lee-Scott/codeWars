package convertStringToCamelCase;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class SolutionTwo {
    public final Pattern REGEX = Pattern.compile("[_-](.)");

    public String toCamelCase(String s) {
        Matcher m = REGEX.matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }
}
