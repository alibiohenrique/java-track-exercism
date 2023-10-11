package week_01.exercise_11;
public class ElonsToyCar {

private final int BATTERY_USAGE = 1;
private final int MILES_DRIVEN_CAPACITY = 20;
private final int BATTERY_CAPACITY = 100;

private int batteryLevel;
private int batteryUsage;
private int distanceDriven;

public ElonsToyCar () {

}

public static ElonsToyCar buy () {

   return new ElonsToyCar();

}

public String distanceDisplay () {

   if (distanceDriven >= 2000) {
      return "Driven 2000 meters";
   }

   return "Driven " + distanceDriven + " meters";

}

public String batteryDisplay () {

   batteryLevel = BATTERY_CAPACITY - (- batteryUsage);

   String display = "";

   if (batteryLevel <= 0) {
      display = "Battery empty";
   }
   else {

      display = "Battery at " + batteryLevel + "%";
   }
   return display;
}

public void drive () {

   distanceDriven += MILES_DRIVEN_CAPACITY;
   batteryUsage -= BATTERY_USAGE;

}

}
