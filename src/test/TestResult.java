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
/** Invokes a recursive function
 */
	System.out.println("The answer will be " + Exercise.recursion(n, m)); 
        }
        else{
          System.out.println("You have entered incorrect numbers.\nIntegers must be entered.\nPlease correct the condition.");}
    }
}