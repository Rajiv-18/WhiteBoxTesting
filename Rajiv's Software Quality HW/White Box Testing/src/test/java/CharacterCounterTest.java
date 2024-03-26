import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CharacterCounterTest {

    @Test
    public void testSingleCharacterNoOccurrences() {
        char[] charArray = {'a'};
        char target = 'x';
        assertEquals(0, CharacterCounter.occurencesCounted(charArray, target));
    }

    @Test
    public void testSingleCharacterOneOccurrence() {
        char[] charArray = {'a'};
        char target = 'a';
        assertEquals(1, CharacterCounter.occurencesCounted(charArray, target));
    }

    @Test
    public void testMultipleCharactersOneOccurrence() {
        char[] charArray = {'a', 'c', 'b', 'd'};
        char target = 'a';
        assertEquals(1, CharacterCounter.occurencesCounted(charArray, target));
    }

    @Test
    public void testMultipleCharactersManyOccurrences() {
        char[] charArray = {'a', 'b', 'a', 'c', 'a'};
        char target = 'a';
        assertEquals(3, CharacterCounter.occurencesCounted(charArray, target));
    }

    @Test
    public void testMultipleCharactersNoOccurrences() {
        char[] charArray = {'b', 'c', 'd'};
        char target = 'a';
        assertEquals(0, CharacterCounter.occurencesCounted(charArray, target));
    }

    @Test
    public void testMultipleCharactersNoTarget() {
        char[] charArray = {'a','b','c'};
        char target = 'a';
        assertEquals(1, CharacterCounter.occurencesCounted(charArray, target));
    }

    @Test
    public void testMultipleCharactersOneTarget() {
        char[] charArray = {'a','b','c'};
        char target = 'd';
        assertEquals(0, CharacterCounter.occurencesCounted(charArray, target));
    }

    @Test
    public void testMultipleCharactersTarget() {
        char[] charArray = {'a','c'};
        char target = 'b';
        assertEquals(0, CharacterCounter.occurencesCounted(charArray, target));
    }
    @Test
    public void testMultipleCharactersOnlyTarget() {
        char[] charArray = {'a','a','a','a'};
        char target = 'a';
        assertEquals(4, CharacterCounter.occurencesCounted(charArray, target));
    }

    @Test
    public void testEdgePairPathSix(){
        char[] charArray = {'c','a','b'};
        char target = 'd';
        assertEquals(0, CharacterCounter.occurencesCounted(charArray, target));
    }

    @Test
    public void testEdgePairPathSeven() {
        char[] charArray = {'a','a','b'};
        char target = 'a';
        assertEquals(2, CharacterCounter.occurencesCounted(charArray, target));
    }

    @Test
    public void testEdgePairPathEight(){
            char[] charArray = {'a','b','c','b','a','b'};
            char target = 'b';
            assertEquals(3, CharacterCounter.occurencesCounted(charArray, target));
    }

    @Test
    public void testEdgePairPathNine() {
        char[] charArray = {'r','a','j','i','v'};
        char target = 'b';
        assertEquals(0, CharacterCounter.occurencesCounted(charArray, target));
    }

    @Test
    public void testPrimePath1() {
        char[] charArray = {'e','e','e','e','e','e','e'};
        char target = 'e';
        assertEquals(0, CharacterCounter.occurencesCounted(charArray, target));
    }

    @Test
    public void testPrimePath2() {
        char[] charArray = {'a','a'};
        char target = 'a';
        assertEquals(2, CharacterCounter.occurencesCounted(charArray, target));
    }

    @Test
    public void testPrimePath3() {
        char[] charArray = {'a','b'};
        char target = 'e';
        assertEquals(0, CharacterCounter.occurencesCounted(charArray, target));
    }
    @Test
    public void testPrimePath4() {
        char[] charArray = {'e','c'};
        char target = 'c';
        assertEquals(1, CharacterCounter.occurencesCounted(charArray, target));
    }

}
