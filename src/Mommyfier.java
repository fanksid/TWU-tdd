import java.util.ArrayList;
import java.util.List;

/**
 * Created by lduan on 10/13/16.
 */
public class Mommyfier {
    public String mommify(String string) {



        String mommyfiedString = replaceVowels(string);

        return mommyfiedString;
    }

    private String replaceVowels(String string) {
        List<String> vowels = new ArrayList<String>();
        vowels.add("o");
        vowels.add("a");
        vowels.add("e");

        for (String vowel : vowels) {
            string = string.replaceAll(vowel, "mommy");
        }

        return string;
    }
}
