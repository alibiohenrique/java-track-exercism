package week_01.exercise_17;

public class Warrior extends Fighter {
  
  @Override
  public int damagePoints (Fighter fighter) {
    
    return fighter.isVulnerable()
           ? 10
           : 6;
  }
  
}
