package week_01.exercise_09;
public class CarsAssemble {

private final int CARS_PER_HOUR = 221;

public double productionRatePerHour (int speed) {

   double sucessRate = 0;
   double productionRate = 0;

   switch (speed) {
      case 1, 2, 3, 4: {
         sucessRate = 1;
         productionRate = CARS_PER_HOUR * speed * sucessRate;
         return productionRate;
      }
      case 5, 6, 7, 8: {
         sucessRate = 0.9;
         productionRate = CARS_PER_HOUR * speed * sucessRate;
         return productionRate;

      }
      case 9: {
         sucessRate = 0.8;
         productionRate = CARS_PER_HOUR * speed * sucessRate;
         return productionRate;
      }
      case 10: {
         sucessRate = 0.77;
         productionRate = CARS_PER_HOUR * speed * sucessRate;
         return productionRate;
      }
      default: {
         return 0;
      }

   }
}

public int workingItemsPerMinute (int speed) {

   int productonPerMinute = (int) productionRatePerHour(speed) / 60;

   return productonPerMinute;

}

}


