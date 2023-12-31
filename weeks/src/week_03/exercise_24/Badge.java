package week_03.exercise_24;

public class Badge {
  
  public String print(Integer id, String name, String department) {
    
    String result = "";
    
    if (id == null && department != null) {
      result = name + " - " + department.toUpperCase();
      
    }
    
    else if (department == null && id == null) {
      result = name + " - OWNER";
      
    }
    else if (department == null) {
      result =  "[" + id + "]" + " - " + name + " - OWNER";
    }
    
    else {
      result =  "[" + id + "]" + " - " + name + " - " + department.toUpperCase();
    }
    return result;
  }
  
  }
