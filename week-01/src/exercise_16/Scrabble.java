package week_01.exercise_16;
public class Scrabble {
  
  private String word;
  
  
  public Scrabble (String word) {
    
    this.word = word;
  }
  
  
  public int getScore () {
    
    int totalScore = 0;
    
    for (char letters : word.toUpperCase().toCharArray()) {
      switch (letters) {
        case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> totalScore += 1;
        case 'D', 'G' -> totalScore += 2;
        case 'B', 'C', 'M', 'P' -> totalScore += 3;
        case 'F', 'H', 'V', 'W', 'Y' -> totalScore += 4;
        case 'K' -> totalScore += 5;
        case 'J', 'X' -> totalScore += 8;
        case 'Q', 'Z' -> totalScore += 10;
      }
    }
    return totalScore;
  }

}



