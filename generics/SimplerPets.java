//: generics/SimplerPets.java
import net.mindview.util.*;
import typeinfo.pets.*;

import java.util.*;

public class SimplerPets {
  public static void main(String[] args) {
    Map<Person, List<? extends Pet>> petPeople = New.map();
    // Rest of the code is the same...
  }
} ///:~
