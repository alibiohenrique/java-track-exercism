package week_03.exercise_28;

  import java.util.ArrayList;
  import java.util.Collections;
  import java.util.List;
  
  public class HandshakeCalculator {
    
    
    public List<Signal> calculateHandshake (int number) {
      
      List<Signal> newList = new ArrayList<>();
      
      String binaryString = Integer.toBinaryString(number);
      StringBuilder stringBuilder = new StringBuilder(binaryString);
      
      stringBuilder.reverse();
      
      switch (stringBuilder.length()) {
        case 1 -> {
          if (stringBuilder.charAt(0) == '1') {
            newList.add(Signal.WINK);
          }
        }
        case 2 -> {
          if (stringBuilder.charAt(0) == '1') {
            newList.add(Signal.WINK);
          }
          if (stringBuilder.charAt(1) == '1') {
            newList.add(Signal.DOUBLE_BLINK);
          }
        }
        case 3 -> {
          if (stringBuilder.charAt(0) == '1') {
            newList.add(Signal.WINK);
          }
          if (stringBuilder.charAt(1) == '1') {
            newList.add(Signal.DOUBLE_BLINK);
          }
          if (stringBuilder.charAt(2) == '1') {
            newList.add(Signal.CLOSE_YOUR_EYES);
          }
        }
        case 4 -> {
          if (stringBuilder.charAt(0) == '1') {
            newList.add(Signal.WINK);
          }
          if (stringBuilder.charAt(1) == '1') {
            newList.add(Signal.DOUBLE_BLINK);
          }
          if (stringBuilder.charAt(2) == '1') {
            newList.add(Signal.CLOSE_YOUR_EYES);
          }
          if (stringBuilder.charAt(3) == '1') {
            newList.add(Signal.JUMP);
          }
        }
        default -> {
          if (stringBuilder.charAt(0) == '1') {
            newList.add(Signal.WINK);
          }
          if (stringBuilder.charAt(1) == '1') {
            newList.add(Signal.DOUBLE_BLINK);
          }
          if (stringBuilder.charAt(2) == '1') {
            newList.add(Signal.CLOSE_YOUR_EYES);
          }
          if (stringBuilder.charAt(3) == '1') {
            newList.add(Signal.JUMP);
          }
          if (stringBuilder.charAt(4) == '1') {
            Collections.reverse(newList);
          }
          
        }
      }
      return newList;
      
    }
    
  }
