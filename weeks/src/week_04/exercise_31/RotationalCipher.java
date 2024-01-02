package week_04.exercise_31;

public class RotationalCipher {
  
  private int password;
  private final char[] alphabet = {'A',
                                   'B',
                                   'C',
                                   'D',
                                   'E',
                                   'F',
                                   'G',
                                   'H',
                                   'I',
                                   'J',
                                   'K',
                                   'L',
                                   'M',
                                   'N',
                                   'O',
                                   'P',
                                   'Q',
                                   'R',
                                   'S',
                                   'T',
                                   'U',
                                   'V',
                                   'W',
                                   'X',
                                   'Y',
                                   'Z'};
  
  
  public RotationalCipher (int shiftKey) {
    
    this.password = shiftKey;
  }
  
  
  public String rotate (String data) {
    
    StringBuilder finalMessage = new StringBuilder();
    
    for (char c : data.toCharArray()) {
      if (Character.isLetter(c)) {
        char rotatedChar = rotateCharacter(c);
        finalMessage.append(rotatedChar);
      }
      else {
        finalMessage.append(c);
      }
    }
    return finalMessage.toString();
  }
  
  
  private char rotateCharacter (char c) {
    
    char base = Character.isUpperCase(c)
                ? 'A'
                : 'a';
    
    int index = (c - base + password) % 26;
    if (index < 0) {
      index += 26;
    }
    char rotatedChar = alphabet[index];
    
    return Character.isUpperCase(c)
           
           ? Character.toUpperCase(rotatedChar)
           
           : Character.toLowerCase(rotatedChar);
    
  }
  
}
