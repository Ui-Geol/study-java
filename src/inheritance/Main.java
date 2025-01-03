package inheritance;

public class Main {

  public static void main(String[] args) {
    Phone phone = new Phone("갤럭시", "검정색");
    
    SmartPhone smartPhone = new SmartPhone("아이폰", "보라색");
    
    phone.hello();
    smartPhone.hello();
    
    boolean result = smartPhone instanceof Phone;

    System.out.println(result);
  }

}
