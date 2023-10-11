package week_01.exercise_13;

public class NeedForSpeed {

   private int batteryDrain;
   private int batteryLeft;
   private int speed;

   private int distanceDriven;

   public NeedForSpeed () {

   }

   public NeedForSpeed (int speed,
                        int batteryDrain) {

      this.batteryLeft = 100;
      this.speed = speed;
      this.batteryDrain = batteryDrain;
   }

   public static NeedForSpeed nitro () {

      return new NeedForSpeed(50,
                              4);
   }

   public void drive () {

      if (batteryLeft > 0) {

         this.distanceDriven += speed;
         batteryLeft -= this.batteryDrain;
      }

   }

   public int distanceDriven () {

      return distanceDriven;
   }

   public boolean batteryDrained () {

      if (batteryLeft <= 0) {
         return true;
      }
      return false;
   }

   @Override
   public String toString () {

      return "NeedForSpeed{" + ", batteryDrain=" + batteryDrain + ", batteryLeft=" + batteryLeft + ", speed=" + speed + ", distanceDriven=" + distanceDriven + '}';
   }

   public int getBatteryDrain () {

      return batteryDrain;
   }

   public int getBatteryLeft () {

      return batteryLeft;
   }

   public int getSpeed () {

      return speed;
   }

}

