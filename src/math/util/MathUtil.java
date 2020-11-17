/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

/**
 *
 * @author PC
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5!="+nhinh.ulti.MathUtility.getFactorial(5));
        //              t gọi hàm tính 5! hy vọng trả về 120
        //    lát hồi hàm chạy coi thhu75c tế là mấu - ACTUAL
        // ACtual  == expected,hàm chạy, hàm chạy đúng cho tình huống nay
        System.out.println("0!="+nhinh.ulti.MathUtility.getFactorial(0));
        
        // cach test kieu này gọi là: MANUAL
        //                          VÌ TA PHÀI NHÌN BẰNG MẮT ĐỂ LUANN65 KẾT QUẢ
        // cách xịn xò ta dùng màu sắc xanh đỏ để luận kết quả dúng sai
        // cach gọi này là test AUTOMATION
        
    }
    
}
