public class guru_qa {

    public static void main (String[] args) {

        byte b = 126 + 1;
        // byte b = 126 + 3; - ошибка, т.к. > 127
        System.out.println(b);

        short s = 32767 / 15;
        // short s = 32767 + 15; - ошибка, т.к. > 32767
        System.out.println(s);

        int i = 64536 * 64536 * 654829; // отрицательный результат из-за переполнения
        System.out.println(i);

        int test_scores = 90;
        if (test_scores > 80 && test_scores < 100)
            System.out.println("We are the champions");
        else if (test_scores <= 25 || test_scores < 5)
            System.out.println("Hello darkness my old friend");

        System.out.println(13 + 14.5); // сложение int и double

        int z = 3;
        long x = 43213;
        double v = z + x;
        System.out.println(v);

        int minus1 = -2000000000;
        int minus2 = -1000000000;
        int minus3 = minus1 + minus2;
        System.out.println(minus3); // переполнение (в другую сторону)

    }
}