import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lduan on 10/13/16.
 */
public class MommyfierTest {
    @Test
    public void shouldReturnEmptyStringWhenGivenEmptyString() throws Exception {
        String emptyString = "";
        String mommyfiedString = new Mommyfier().mommify(emptyString);
        assertEquals("", mommyfiedString);
    }

    @Test
    public void shouldReturnTheStringWithoutVowels() throws Exception {
        String stringWithoutVowels = "sky";
        String mommifiedString = new Mommyfier().mommify(stringWithoutVowels);
        assertEquals("sky", mommifiedString);
    }

    @Test
    public void shouldReturnMommyWhenInputIsVowel() throws Exception {
        String vowel = "e";
        String mommifiedString = new Mommyfier().mommify(vowel);
        assertEquals("mommy", mommifiedString);

    }

    @Test
    public void shouldReturnMommifiedStringWithReplacedVowels() throws Exception {
        String stringWithMultiVowels = "eye";
        String mommifiedString = new Mommyfier().mommify(stringWithMultiVowels);
        assertEquals("mommyymommy", mommifiedString);
    }

    @Test
    public void shouldReplaceVowelAAndEWithMommy() throws Exception {
        String stringWithVowels = "era";
        String mommifiedString = new Mommyfier().mommify(stringWithVowels);
        assertEquals("mommyrmommy", mommifiedString);

    }

    @Test
    public void shouldReturnMommyfiedStringAndReplaceVowelAEO() throws Exception {
        String stringWithAEO = "arero";
        String mommifiedString = new Mommyfier().mommify(stringWithAEO);
        assertEquals("mommyrmommyrmommy", mommifiedString);
    }


}
