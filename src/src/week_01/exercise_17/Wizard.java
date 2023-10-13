package week_01.exercise_17;

public class Wizard extends Fighter {
  
  private boolean spellInAdvance = false;
  
  
  @Override
  public boolean isVulnerable () {
    
    if (spellInAdvance) {
      return false;
    }
    else {
      return true;
    }
    
  }
  
  
  @Override
  public int damagePoints (Fighter fighter) {
    
    return spellInAdvance
           ? 12
           : 3;
  }
  
  
  public void prepareSpell () {
    
    spellInAdvance = true;
    
  }
  
}
