package week_01.exercise_14;
public class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar> {

  private int distanceTravelled;
  private int numberOfVictories;

  @Override
  public void drive () {

    this.distanceTravelled += 20;
  }

  @Override
  public int getDistanceTravelled () {

    return distanceTravelled;
  }

  public int getNumberOfVictories () {

    return numberOfVictories;
  }

  public void setNumberOfVictories (int numberOfVictories) {

    this.numberOfVictories = numberOfVictories;
  }

  @Override
  public int compareTo (ProductionRemoteControlCar otherCar) {

    return Integer.compare(otherCar.getNumberOfVictories(), this.getNumberOfVictories());
  }

}
