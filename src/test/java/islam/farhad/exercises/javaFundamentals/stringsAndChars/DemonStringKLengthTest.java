//package islam.farhad.exercises.javaFundamentals.stringsAndChars;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Assertions;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//class DemoStringKLengthTest {
//
//    @Test
//    public void testGetListOfArrayStringLengthsWhenListIsNullThenReturnEmptyList() {
//        // Arrange
//        List<String> inputList = null;
//
//        // Act
//        List<Integer> result = DemoStringKLength.getListOfArrayStringLengths(inputList);
//
//        // Assert
//        Assertions.assertNotNull(result, "The result should not be null.");
//        Assertions.assertTrue(result.isEmpty(), "The result should be an empty list.");
//    }
//
//    @Test
//    public void testGetListOfArrayStringLengthsWhenListIsEmptyThenReturnEmptyList() {
//        // Arrange
//        List<String> inputList = new ArrayList<>();
//
//        // Act
//        List<Integer> result = DemoStringKLength.getListOfArrayStringLengths(inputList);
//
//        // Assert
//        Assertions.assertNotNull(result, "The result should not be null.");
//        Assertions.assertTrue(result.isEmpty(), "The result should be an empty list.");
//    }
//
//    @Test
//    public void testGetListOfArrayStringLengthsWhenListContainsStringsOfDifferentLengthsThenReturnListOfSameLengths() {
//        // Arrange
//        List<String> inputList = Arrays.asList("One", "Two", "Three", "Four", "Five");
//
//        // Act
//        List<Integer> result = DemoStringKLength.getListOfArrayStringLengths(inputList);
//
//        // Assert
//        Assertions.assertNotNull(result, "The result should not be null.");
//        Assertions.assertEquals(inputList.size(), result.size(), "The result list should have the same size as the input list.");
//        for (int i = 0; i < inputList.size(); i++) {
//            Assertions.assertEquals(inputList.get(i).length(), result.get(i), "The length of the string at index " + i + " should match the value in the result list.");
//        }
//    }
//}