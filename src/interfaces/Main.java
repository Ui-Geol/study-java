package interfaces;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    long millis = System.currentTimeMillis();
    
    long nanoS = System.nanoTime();

    System.out.println(millis);
    System.out.println(nanoS);

    String value = System.getProperty("java.specification.version");
    System.out.println(value);
  }

  
  
}
