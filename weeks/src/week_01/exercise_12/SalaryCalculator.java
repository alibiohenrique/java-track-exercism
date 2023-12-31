package week_01.exercise_12;

public class SalaryCalculator {

   public double multiplierPerDaysSkipped (int daysSkipped) {

      double result = (daysSkipped > 5)
              ? 0.85
              : 1;

      return result;

   }

   public int multiplierPerProductsSold (int productsSold) {

      int multiplier = (productsSold > 20)
              ? 13
              : 10;

      return multiplier;

   }

   public int bonusForProductSold (int productsSold) {

      int bonusPerProduct = productsSold * multiplierPerProductsSold(productsSold);

      return bonusPerProduct;
   }

   public double finalSalary (int daysSkipped,
                              int productsSold) {

      double multiplier = multiplierPerDaysSkipped(daysSkipped) * 1000;
      double bonus = bonusForProductSold(productsSold);

      double finalSalary = (multiplier + bonus > 2000)
              ? 2000
              : multiplier + bonus;

      return finalSalary;
   }

}
