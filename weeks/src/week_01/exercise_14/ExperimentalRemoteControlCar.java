package week_01.exercise_14;
public class ExperimentalRemoteControlCar implements RemoteControlCar {

  private int distanceTravelled;

  @Override
  public void drive () {

    this.distanceTravelled += 10;

  }

  @Override
  public int getDistanceTravelled () {

    return distanceTravelled;

  }

}
