import java.io.*;
import java.util.*;
import java.math.*;

class Solution {

  public static void main(String[] args) {
    BigInteger a = BigInteger.valueOf(1);
    BigInteger b = BigInteger.valueOf(1);

    for (int i = 0; i < 100; i++) {
      BigInteger tmp = b;

      b = b.add(a);
      a = tmp;

      System.out.println(b);
    }
  }
}
