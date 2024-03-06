package islam.farhad.exercises.java8commonQA;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMostRepeatedElemanentArrayListDiffblueTest {
    /**
     * Method under test:
     * {@link FindMostRepeatedElemanentArrayList#findMostRepeatedElementsInAnArray(List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindMostRepeatedElementsInAnArray() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.base/java.util.Optional.get(Optional.java:143)
        //       at islam.farhad.exercises.java8commonQA.FindMostRepeatedElemanentArrayList.findMostRepeatedElementsInAnArray(FindMostRepeatedElemanentArrayList.java:19)
        //   See https://diff.blue/R013 to resolve this issue.

        FindMostRepeatedElemanentArrayList.findMostRepeatedElementsInAnArray(new ArrayList<>());
    }

    /**
     * Method under test:
     * {@link FindMostRepeatedElemanentArrayList#findMostRepeatedElementsInAnArray(List)}
     */
    @Test
    void testFindMostRepeatedElementsInAnArray2() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("foo");
        assertEquals("foo", FindMostRepeatedElemanentArrayList.findMostRepeatedElementsInAnArray(stringArrayList));
    }

    /**
     * Method under test:
     * {@link FindMostRepeatedElemanentArrayList#findMostRepeatedElementsInAnArray(List)}
     */
    @Test
    void testFindMostRepeatedElementsInAnArray3() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("42");
        stringArrayList.add("foo");
        assertEquals("foo", FindMostRepeatedElemanentArrayList.findMostRepeatedElementsInAnArray(stringArrayList));
    }
}
