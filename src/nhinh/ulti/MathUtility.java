/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhinh.ulti;

/**
 *
 * @author PC
 */
public class MathUtility {
    //lam fake giong nhu ham that
    //JDK co java.util.Math co loai ham stactic
    // abs, sin, 
    public static final double PI = 3.14;
    // n! tăng nhanh, nen minh chi tinh 20! toi da 21! tràn long
    public static long getFactorial(int n){
        if (n<0 || n>20) {
            throw new IllegalArgumentException("n must be between 1 .. 20");
        }
        if (n==0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result*=i;
        }
        return result;
    }
}
