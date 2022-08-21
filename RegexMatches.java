import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    // regex value
    private static final String REGEX = "\\bcat\\b";
    private static final String REGEX2 = "foo";
    private static final String REGEX3 = "-";
    private static final String REGEX4 = "a*b";

    // input to be searched upon
    private static final String INPUT = "cat cat cat cattle cat";
    private static final String INPUT2 = "fooooooooooooo";
    private static final String INPUT3 = "aabfoooaabfooabfoob";

    // define the pattern variables
    private static Pattern p;
    private static Pattern pattern;
    private static Pattern pat;
    private static Matcher m;
    private static Matcher matcher;
    private static Matcher mat;

    private static String REPLACE = "bird";
    private static String REPLACE2 = "-";

    public static void main(String args[]) {
        p = Pattern.compile(REGEX);
        pattern = Pattern.compile(REGEX2);
        pat = Pattern.compile(REGEX4);
        m = p.matcher(INPUT);
        matcher = pattern.matcher(INPUT2);
        mat = pat.matcher(INPUT3);

        String replace = m.replaceAll(REPLACE);
        System.out.println("Replaced word " + replace);

        // converts to buffer
        StringBuffer sb = new StringBuffer();
        while (mat.find()) {
            mat.appendReplacement(sb, REPLACE2);
        }

        mat.appendTail(sb);
        System.out.println(sb.toString());

        int count = 0;

        while (m.find()) {
            count++;
            System.out.println("Match count " + count);
            System.out.println("Start() " + m.start());
            System.out.println("End() " + m.end());

            // checks the regex value only
            System.out.println("Match looking at " + matcher.lookingAt());

            // checks all the inputs
            System.out.println("Match matches " + matcher.matches());
        }
    }
}
