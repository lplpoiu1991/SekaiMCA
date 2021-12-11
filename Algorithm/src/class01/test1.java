package class01;

import javax.swing.*;

public class test1 {
    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            //创造每位的数字  进行与运算，判断是否为1
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");

        }
        System.out.println("");
    }



    public static void main(String[] args) {
        int num = 2;
        print(num);

        System.out.println(2<<2);

        System.out.println(Integer.MAX_VALUE);

        print(Integer.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);

        print(Integer.MIN_VALUE);

    }
}
