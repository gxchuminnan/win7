package book2;

//简单bitset应用
import java.util.BitSet;
public class BitOHoney {
  public static void main(String args[]) {
   String names[] = { "Java", "Source", "and", "Support"};
    BitSet bits = new BitSet();
    for (int i = 0, n = names.length; i < n; i++) {
      if ((names[i].length() % 2) == 0) {
        bits.set(i);
      }
    }
    System.out.println(bits);
    System.out.println("Size : " + bits.size());
    System.out.println("Length: " + bits.length());
    for (int i = 0, n = names.length; i < n; i++) {
      if (!bits.get(i)) {
        System.out.println(names[i] + " is odd");
      }
    }
    BitSet bites = new BitSet();
    bites.set(0);
    bites.set(1);
    bites.set(2);
    bites.set(3);
    bites.andNot(bits);//清除bits的    清除此 BitSet 中已设置的所有的位
  
    System.out.println(bites);
  }
}

