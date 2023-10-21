package week_01.exercise_18;

public class CalculatorConundrum {
  
  public String calculate (int operand1, int operand2, String operation) throws IllegalOperationException {
    
    int result;
    
    if (operation == null) {
      throw new IllegalArgumentException("Operation cannot be null");
    }
    if (operation.isEmpty()) {
      throw new IllegalArgumentException("Operation cannot be empty");
      
    }
    
    try {
      switch (operation) {
        case "/" -> {
          
          result = operand1 / operand2;
          return formatResult(operand1, operand2, operation, result);
          
        }
        case "+" -> {
          result = operand1 + operand2;
          return formatResult(operand1, operand2, operation, result);
        }
        case "*" -> {
          result = operand1 * operand2;
          return formatResult(operand1, operand2, operation, result);
        }
       
        
        default -> throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
      }
      
    }
    catch (ArithmeticException e) {
      throw new IllegalOperationException("Division by zero is not allowed", e);
      
    }
  }
  
  
  private static String formatResult (int operand1, int operand2, String operator, int result) {
    
    return String.format("%d %s %d = %d", operand1, operator, operand2, result);
    
  }
  
}
