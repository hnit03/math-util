/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhinh.ulti.test;

import nhinh.ulti.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class MathUtilityTest {
    @Test //kí hiệu Junit đưa ra, biến hàm sau đây thành
    //public static void main(), app có nhiều main()
    //F6 chạy main() mặc định, Shift-F6 là chạy main() ở @Test
    //đây là 1 trong những cách đặt tên cho hàm test, để testcode chính
    
    public void getFactory_RunsWell_IfValidArgument() {
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(240, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
        
    }
    //xanh chỉ đạt dc nếu tất cả cùng xanh, nếu đúng hết tất cả
    //đỏ chỉ cần ít nhất 1 thèn đỏ , coi như đỏ tất cả 
    //ý nghĩa: hàm đã đúng thì phải đúng kết quả 
}
//viết code để test code chính(Math Utility)
//viết code dùng thư viện JUnit,xUnit, Jasmine,... để test
//xem code chính chạy ổn không trước khi đem qua bên khách hàng trải nghiệm
//và thư viện này cung cấp cài cơ chế báo đúng sai qua màu sắc xanh đỏ
//mắt chỉ nhìn 2 màu là đủ, khỏi cần so sánh expected và actual rồi kết