package domain;

/**
 *The class that calculates
 * @author asus
 */
public class Exercise {
	
public static byte recursion(byte n, int m) {
		 
	if (n == 0) {
	return (byte) (m + 1);
	}
        else if (m == 0 && n > 0) {
	return recursion((byte) (n - 1), 1);
	} 
		
	else {
	return recursion((byte) (n - 1), recursion(n, (byte) (m - 1)));
}
 }
  }