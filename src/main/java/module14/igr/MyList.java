package module14.igr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
public class MyList {
  private Integer[] ints = {1, 2, 3, 4, 5, 6};
  public ArrayList<Integer> intsArr = new ArrayList<>(Arrays.asList(ints));
  public synchronized void delete(){
    if (intsArr.size() > 0) {
      intsArr.remove(0);
      System.out.println(intsArr);
    }else System.out.println("Cannot delete");
  }
  public synchronized void change(int position){
    if (intsArr.size() > 0) {
      intsArr.set(position, intsArr.get(position) * 2);
      System.out.println(intsArr);
    }else System.out.println("Cannot change");
  }
}

