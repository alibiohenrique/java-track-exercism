package week_03.exercise_27;

public class MicroBlog {
  
  public String truncate (String input) {
    
    int charCount = 0;
    StringBuilder result = new StringBuilder();
    
    for (int i = 0 ; i < input.length() ; i+= Character.charCount(input.codePointAt(i))) {
      if(charCount < 5) {
        result.append(Character.toChars(input.codePointAt(i)));
        charCount++;
      }
      else  {
        break;
      }
    }
    return result.toString();
  }
}

