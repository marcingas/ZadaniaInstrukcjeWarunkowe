package cars;

public class Car {
  private Engine engine; // kompozycja

  public Car(Engine engine) {
    this.engine = engine;
  }

  public void startCar(){
    System.out.println("uruchamiamy auto...");
    String engineLog = engine.run();
    System.out.println(engineLog);
  }
}
