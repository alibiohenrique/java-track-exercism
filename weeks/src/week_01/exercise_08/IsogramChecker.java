package week_01.exercise_08;
import java.util.Arrays;

public class IsogramChecker {

public boolean isIsogram (String phrase) {

   phrase = phrase.toLowerCase();
   String removeHyphenAndSpaces = phrase.replaceAll("-", "").replaceAll(" ", "");

   int length = removeHyphenAndSpaces.length();
   char[] chars = removeHyphenAndSpaces.toCharArray();

   Arrays.sort(chars);

   for (int i = 0; i < length - 1; i++) {
      if (chars[i] == chars[i + 1]) {
         return false;
      }
   }
   return true;
}

}
