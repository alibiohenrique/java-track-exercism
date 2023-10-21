package week_01.exercise_01;

public class Lasagna {

    private final int MINUTES_IN_OVEN = 40;
    private final int MINUTES_EACH_LAYER = 2;

    public int expectedMinutesInOven () {

        return MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven (int minutesLeft) {

        int calculateRemainingMinutes = MINUTES_IN_OVEN - minutesLeft;
        return calculateRemainingMinutes;
    }

    public int preparationTimeInMinutes (int layers) {

        int calculatePreparationTime = MINUTES_EACH_LAYER * layers;
        return calculatePreparationTime;
    }

    public int totalTimeInMinutes (int layers,
                                   int timeInOven) {

        int calculateTotalTime = preparationTimeInMinutes(layers) + timeInOven;
        return calculateTotalTime;
    }

}
