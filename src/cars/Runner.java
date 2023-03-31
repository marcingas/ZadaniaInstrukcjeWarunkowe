package cars;

public class Runner {
  public static void main(String[] args) {
    Engine electricEngine = new ElectricEngine();
    Car car = new Car(electricEngine);
    car.startCar();
  }
}
