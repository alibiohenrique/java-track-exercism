package exercise_23;

public class Hamming {
  
  public String leftStrand;
  public String rightStrand;
  
  public Hamming (String leftStrand, String rightStrand) {
    
    if(leftStrand.length() != rightStrand.length()) {
      
      throw new IllegalArgumentException("strands must be of equal length");
      
      
    }
    
    
    this.leftStrand = leftStrand;
    this.rightStrand = rightStrand;
  
  }
  public int getHammingDistance()  {
    int hammingDistance = 0;
    
    char [] leftChars = leftStrand.toCharArray();
    char [] rightChars = rightStrand.toCharArray();
    
    for (int i = 0; i < leftChars.length ; i++) {
        if(leftChars[i] != rightChars[i]) {
          hammingDistance++;
        }
        
    }
    return hammingDistance;
  }
}
