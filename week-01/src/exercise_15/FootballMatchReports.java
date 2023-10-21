package week_01.exercise_15;
public class FootballMatchReports {
  
  public static String onField (int shirtNum) throws IllegalArgumentException {
    
    String position = null;
    
    if (shirtNum < 1 || shirtNum > 11) {
      throw new IllegalArgumentException("Shirt must be between 1 and 11");
    }
    
    switch (shirtNum) {
      case 1 -> position = "goalie";
      case 2 -> position = "left back";
      case 3, 4 -> position = "center back";
      case 5 -> position = "right back";
      case 6, 7, 8 -> position = "midfielder";
      case 9 -> position = "left wing";
      case 10 -> position = "striker";
      case 11 -> position = "right wing";
    }
    
    return position;
  }
  
}
