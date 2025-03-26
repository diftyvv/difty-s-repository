package chapter4exercise;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BE411ConvertNumberFrom10To16DoubaoVersion {
    public static void main(String[] args) {
        System.out.print("请输入一个大于0的十进制整数，我们会将它转换成十六进制：");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        List<String> list = new ArrayList<>();
        System.out.print("十进制整数" + num + "转换成十六进制整数是：");

        while (num > 0) {
            int remainder = num % 16;
            if (remainder < 10) {
                list.add(Integer.toString(remainder));
            } else {
                list.add(String.valueOf((char) ('A' + remainder - 10)));
            }
            num /= 16;
        }

        if (list.isEmpty()) {
            System.out.print("0");
        } else {
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i));
            }
        }
        input.close();
    }
}