package week_01.exercise_17;

public abstract class Fighter {
  
  
  
  public boolean isVulnerable () {
    
    return false;
  }
  
  
  public abstract int damagePoints (Fighter fighter);
  
  
  @Override
  public String toString () {
    
    return "Fighter is a " + getClass().getName();
  }
  
}


  
  



