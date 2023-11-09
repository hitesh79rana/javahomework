package javahomework;
public class ForLoopEvenOddNumber {
        public static void main(String[] args) {
            int num = 20;
            for (int h = 0; h <= num; h++) {
                if (h % 2 == 0) {
                    System.out.println("EVEN NUMBERS:" + h);
                } else {
                    System.out.println("ODD NUMBERS:" + h);
                }
            }
        }
}
