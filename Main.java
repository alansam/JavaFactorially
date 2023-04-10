/**
 *  @author: Alan Sampson
 */

import java.math.BigInteger;

/**
 *  Class Main.
 */
class Main {
  /**
   *  main()
   */
  public static void main(String[] args) {
    System.out.println("Hello world!");
    long fac = 54l;
    BigInteger factorial_v;

    for (long f_n = 1; f_n < fac + 1; ++f_n) {
      factorial_v = factorial(f_n);
      System.out.printf("%4d! %80s%n", f_n, factorial_v.toString());
    }
    return;
  }

  /**
   *  factorial()
   */
  public static BigInteger factorial(long f_n) {
    BigInteger fac = BigInteger.ONE;
    if (f_n > 1l) {
      for (long f_ = 1l; f_ < f_n + 1; ++f_) {
        fac = fac.multiply(BigInteger.valueOf(f_));
      }
    }
    return fac;
  }
}
