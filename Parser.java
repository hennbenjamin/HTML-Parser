import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {


    public static void main(String[] args) {
         String str = "<img>PDF Stream</img><img> PDF Stream 2</img> <img>Lorem ipsum dolor sit amet, " +
                 "consectetur adipisici elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua." +
                 " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid ex ea commodi consequat. " +
                 "Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                 "Excepteur sint obcaecat cupiditat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. </img> ";

        //gibt PDF Stream in der Konsole aus
        System.out.println(Arrays.toString(getTagValues(str).toArray()));
    }

    private static final Pattern TAG_REGEX = Pattern.compile("<img>(.+?)</img>", Pattern.DOTALL);

    private static List<String> getTagValues(final String str) {
        final List<String> tagValues = new ArrayList<String>();
        final Matcher matcher = TAG_REGEX.matcher(str);
        while (matcher.find()) {
            tagValues.add(matcher.group(1));
        }
        return tagValues;
    }









}
