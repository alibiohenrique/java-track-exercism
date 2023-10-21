package week_01.exercise_07;

public class BirdWatcher {

private final int[] birdsPerDay;

public BirdWatcher (int[] birdsPerDay) {

   this.birdsPerDay = birdsPerDay.clone();
}

public int[] getLastWeek () {

   int[] lastWeekCount = {0, 2, 5, 3, 7, 8, 4};
   return lastWeekCount;
}

public int getToday () {

   int lastBirdsCount = birdsPerDay[birdsPerDay.length - 1];
   return lastBirdsCount;
}

public void incrementTodaysCount () {

   int todaysCount = birdsPerDay.length - 1;
   birdsPerDay[todaysCount]++;
}

public boolean hasDayWithoutBirds () {

   for (int birds : birdsPerDay) {
      if (birds == 0) {
         return true;
      }
   }
   return false;
}

public int getCountForFirstDays (int numberOfDays) {

   int[] newBirdList = new int[numberOfDays];
   int birdsCount = 0;
   for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
      newBirdList[i] = birdsPerDay[i];
      birdsCount += newBirdList[i];
   }
   return birdsCount;
}

public int getBusyDays () {

   int busyDayCounter = 0;
   for (int busyDays : birdsPerDay) {
      if (busyDays >= 5) {
         busyDayCounter += 1;
      }
   }
   return busyDayCounter;
}

}
