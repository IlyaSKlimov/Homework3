
public class Hometask3 {
    public static void main(String[] args) {
        //Task 1
        byte a = 127;
        short b = 255;
        byte c = (byte) (a-b);
        System.out.println(c);
        //-127...128, 1 byte

        //Task 2
        short d = -32768;
        int e = 32768;
        short f = (short) (d+e);
        System.out.println(f);
        //-32768...32767, 2 bytes

        //Task 3
        int x = 1200;
        System.out.println(x);
        System.out.println(x*x);
        System.out.println(x*x*x);
        //-2147483648...2147483647, 4 bytes

        //Task 4
        long g = 922372036854775807L;
        System.out.println(g);
        //-922372036854775808...922372036854775807, 8 bytes, document's ID

        //Task 5
        float A = 1245.554F; //3,4e-38 < |x| < 3,4e38, 4 bytes
        double B = 256.3785; //1,7e-308 < |x| < 1,7e308, 8 bytes
        float AB = (float) (A*B);
        System.out.println(AB);

        //Task 6
        char a1 = '+';
        char a2 = 43;
        char a3 = '\u002B';
        char b1 = '!';
        char b2 = 33;
        char b3 = '\u0021';
        char c1 = '?';
        char c2 = 63;
        char c3 = '\u003F';
        System.out.println(a1 + " " + a2 + " " + a3);
        System.out.println(b1 + " " + b2 + " " + b3);
        System.out.println(c1 + " " + c2 + " " + c3);
        //0...65536, 2 bytes

        //Task 7
        //int h = 'r';
        char i = 123;
        System.out.println(i);
        //float j = 7.2;
        //short k = 3L;
        double l = 0x123D;
        System.out.println(l);
        int m = 0x123F;
        System.out.println(m);
        //int n = 078;
        short o = 7;
        System.out.println(o);
        //byte p = 255;
        double q = 9;
        System.out.println(q);
        //int r = 5.5;
        int t = 5;
        System.out.println(t);

        //Task 8
        int num2 = 0b10110;
        /*22/2 = 11 (0)
         11/2 = 5 (1)
         5/2 = 2 (1)
         2/2 = 1 (0)*/

        System.out.println(num2);
        int num8 = 0273;
        //187/8 = 23 (3)
        //23/8 = 2 (7)
        //2/8 = 0 (2)
        System.out.println(num8);
        int num16 = 0xBB;
        //187/16 = 11 (11)
        //11/16 = 0 (11)
        System.out.println(num16);

        //Task 9 - Object Reference Types
        Integer x1 = 3;
        int x2 = 9;
        System.out.println(x1.equals(2)); //false

        //On STACK we store: primitive data types and references
        //On HEAP we store: objects, classes and methods

        //Task 9 - Wrapper Classes
        //Byte, Short, Integer, Long, Float, Double, Boolean, Character store about 5-times more than their primitive data types analogues

        //STRINGs
        String s = "JAVA";
        System.out.println(s.toLowerCase()); //java

        String s1 = "Python";
        System.out.println(s1.repeat(3)); //PythonPythonPythonPython

        String s2 = "FAJJFdsaldask";
        System.out.println("The length of the txt string is " + s2.length());

        String s3 = "upper";
        System.out.println(s3.toUpperCase() + " (CASE)"); // UPPER (CASE)

        String s4 = "Stop all the clocks, cut off the telephone,\n " +
                "Prevent the dog from barking with a juicy bone,\n " +
                "Silence the pianos and with muffled drum \n " +
                "Bring out the coffin, let the mourners come.";
        System.out.println(s4.indexOf("clocks")); //13

        String name = "Ilya ";
        String surname = "Klimov";
        System.out.println(name.concat(surname)); //Ilya Klimov

        String txt3 = "I love \tlearning \"Java\"";
        System.out.println(txt3); //I love 	learning "Java"
    }
}
