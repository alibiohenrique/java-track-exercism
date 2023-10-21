package week_01.exercise_06;

public class ReverseString {

    public String reverse(String inputString) {

        StringBuilder stringBuilder = new StringBuilder(inputString);

        stringBuilder.reverse();

        String messageReversed = stringBuilder.toString();

        return messageReversed;
    }

}
