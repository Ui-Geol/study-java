package inheritance;

public class SmartPhone extends Phone {
  
  public SmartPhone(String model, String color) {
    super(model,color);
  }
  
  public void hello() {
    System.out.println("hello, I'm smartphone");
  }

}
