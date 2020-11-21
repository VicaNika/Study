package HomeWork5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RexExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        Pattern pattern = Pattern.compile("[.|\\p{Space}|\\p{Punct}]" + word + "[\\p{Punct}|\\p{Space}]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        //"[.|\\p{Space}|\\p{Punct}]" + word + "[\\p{Punct}|\\p{Space}]"
        //\p{Lu}
        int count = 0;
        while (matcher.find()) {
            count++;

        }
        return count;
    }
}