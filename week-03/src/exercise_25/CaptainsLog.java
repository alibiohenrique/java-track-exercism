package exercise_25;

import java.util.Random;

public class CaptainsLog {
  
  private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
  
  private Random random;
  
  
  
  public CaptainsLog(Random random) {
    this.random = random;
  }
  
  public char randomPlanetClass() {
    
    int range = random.nextInt(10);
    
    switch (range) {
      case 0 -> {return 'D';}
      case 1 -> {return 'H';}
      case 2 -> {return 'J';}
      case 3 -> {return 'K';}
      case 4 -> {return 'L';}
      case 5 -> {return 'M';}
      case 6 -> {return 'N';}
      case 7 -> {return 'R';}
      case 8 -> {return 'T';}
      case 9 -> {return 'Y';}
      default -> throw new IllegalStateException("Unexpected value: " + range);
    }
    
    
  }
  
  public String randomShipRegistryNumber() {
    int shipNumber = random.nextInt(1000,10000);
    
    return "NCC-" + shipNumber;
  }

  public double randomStardate() {
    
    return random.nextDouble(41000.0, 42000.0);
    
    
  }
}
