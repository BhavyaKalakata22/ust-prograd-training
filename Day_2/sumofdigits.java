public class DRoot {
  public static int digital_root(int n) {
    int result = 0;
  int count = 0;

  while (0 < n) {
    result += n % 10;
    n /= 10;
    count++;
  }

  return 1 < count ? digital_root(result) : result;
}
  }