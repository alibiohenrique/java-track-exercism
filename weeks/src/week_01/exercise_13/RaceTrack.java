package week_01.exercise_13;
public class RaceTrack {

   private int distance;

   public RaceTrack () {

   }

   public RaceTrack (int distance) {

      this.distance = distance;
   }

   public boolean tryFinishTrack (NeedForSpeed car) {

      int distanceDriven = 0;

      while (distanceDriven < distance && ! car.batteryDrained()) {
         car.drive();
         distanceDriven += car.getSpeed();
      }

      return distanceDriven >= distance;

   }

}
