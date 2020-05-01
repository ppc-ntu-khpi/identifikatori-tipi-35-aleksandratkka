package test;
/**
 *
 * @author asus
 */
import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        byte n = 1;
	byte m = 1;
	 if(n > 0 && m > 0) {
	System.out.println("Answer " + Exercise.recursion(n, m)); 
        }
        else{
          System.out.println("Numbers are incorrect.");}
    }
}
