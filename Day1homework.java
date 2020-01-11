import org.testng.annotations.Test;
public class Day1homework {

    @Test
    public void test001Day() {
        System.out.println("Good day");
    }

    @Test
    public void test002Numbers() {
        int myNumber;
        myNumber = 5;
        System.out.println(myNumber);
    }

    @Test
    public void test003Numbers() {
        int myNumber = -18;
        System.out.println(myNumber);
    }

    @Test
    public void test004Numbers() {
        byte four = 4;
        String output = "This is " + four + " you";
        System.out.println(output);
    }

    @Test
    public void test005Numbers() {
        float a = 4.5f;
        System.out.println(a);

    }

    @Test
    public void test006Characters() {
        char a = 'd';
        System.out.println(a);
    }

    @Test
    public void test007Characters() {
        char b = '&';
        System.out.println(b);
    }

    @Test
    public void test008Characters() {
        char c = 'D';
        System.out.println(c);
    }

    @Test
    public void test009Characters() {
        String s1 = "Who let the cats out?";
        String s2 = " Who who who dogs!";
        String s3 = s1 + s2;
        System.out.println(s3);
    }

    @Test
    public void test010Characters() {
        int num = 5;
        String s = "I have " + num + " cookies";
        System.out.println(s);
    }

    @Test
    public void test011Characters() {
        float num = 0.5f;
        String s4 = "I have " + num + " cookies";
        System.out.println(s4);
    }

    @Test
    public void test012Characters() {
        int a = 2;
        float b = 0.5f;
        String s5 = "We have " + a + " bottles of water and " + b + " cookies";
        System.out.println(s5);
    }

    @Test
    public void test013Boolian() {
        boolean b = false;
        System.out.println(b);
    }

    @Test
    public void test014Boolean() {
        boolean a = true;
        boolean b = false;
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void test015Boolean() {
        boolean a = true;
        boolean b = false;
        String s6 = "It doesn't matter " + a + " or " + b;
        System.out.println(s6);
    }

    @Test
    public void test016Boolean() {
        int a = 4;
        boolean b = true;
        String s7 = "Success is a progressive realisation of the worthy ideal, this is " + b + " value " + a + " me";
        System.out.println(s7);
    }

    @Test
    public void test017Conditions() {
        int a = 4;
        boolean b = a == 4;

        if (b) {
            System.out.println("It's true!");
        }
    }

    @Test
    public void test018Conditions() {
        float a = -1.2f;
        boolean b = a == -1.2f;
        System.out.println(b);
    }

    @Test
    public void test019Conditions() {
        int a = 4;
        if (a == 4) {
            System.out.println("Ohhh! So a is 4!");
        }
    }

    @Test
    public void test020Conditions() {
        int a = 5;
        if (a == 5) {
            String s8 = "На русском языке! So this is " + a + ".";
            System.out.println(s8);
        }
    }

    @Test
    public void test021Conditions() {
        int a = 4;
        int b = 5;
        boolean result;
        result = a < b;
        System.out.println(result);
    }

    @Test
    public void test022Conditions() {
        int a = 5;
        int b = 7;
        boolean result;
        result = a < b;
        String s9 = "This is " + result + ", that " + a + " is less than " + b + ".";
        System.out.println(s9);
    }

    @Test
    public void test023Conditions() {
        float a = 3.1416f;
        float b = 3.1416f;
        boolean result = a == b;
        System.out.println(result);
    }

    @Test
    public void test024Conditions() {
        byte a = 0;
        byte b = 127;
        boolean result = a != b;
        System.out.println(result);
    }

    @Test
    public void test025Conditions() {
        byte c = 126;
        byte d = 125;
        boolean result = c > d || c < d;
        System.out.println(result);
    }

    @Test
    public void test026Conditions() {
        byte a = 4;
        boolean result = 3 < a && a < 6;
        System.out.println(result);
    }

    @Test
    public void test027Conditions() {
        byte a = 4;
        boolean result = 3 < a && a < 6;
        result = !result;
        System.out.println(result);
    }

    @Test
    public void test028Conditions() {
        boolean a = true;
        a = !!a;
        System.out.println(a);
    }

    @Test
    public void test029Conditions() {
        short a = 32767;
        short b = 32767;
        if (a == b) {
            System.out.println("a=b");
        }
    }

    @Test
    public void test030Conditions() {
        short x = 5;
        short y = -5;
        if (x == y) {
            System.out.println("x is equal to y");
        } else {
            System.out.println("x not equal to y");
        }
    }

    @Test
    public void test031Conditions() {
        int a = 20;
        int b = 20;
        if (a == b)
            System.out.println("a equal to b");
        else
            System.out.println("a not equal to b");
    }

    @Test
    public void test032Conditions() {
        int a = 4;
        int result = a == 4 ? 1 : 8;
        System.out.println(result);
    }

    @Test
    public void test033Conditions() {
        String a = new String("Wow");
        String b = new String("wow");
        String sameB = b;
        System.out.println(sameB);
    }

    @Test
    public void test034Conditions() {
        String a = "Wow";
        String b = a;
        String c = b + "!";
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }

    @Test
    public void test035Array() {
        int[] arr;
        arr = new int[7];
        System.out.println(arr.length);
    }

    @Test
    public void test037Array() {
        int[] arr = new int[5];
        arr[0] = 4;
        System.out.println(arr[0]);
    }

    @Test
    public void test038Array() {
        int[] arr = new int[5];
        arr[0] = 4;
        arr[1] = arr[0] + 5;
        System.out.println(arr[1]);
    }

    @Test
    public void test039Array() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr.length);
    }

    @Test
    public void test040Array() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test041Loops() {
        for (int i = 0; i < 3; i++) {

        }
    }

    @Test
    public void test042Loops() {
        int[] arr = {1, 9, 9, 5};
        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            System.out.println(el);
        }
    }

    @Test
    public void test043Loops() {
        int[] arr = {2, 0, 1, 3};
        for (int el : arr) {
            System.out.println(el);
        }
    }

    @Test
    public void test044Loops() {
        int i;
        for (i = 0; i < 5; i++) {
            if (i >= 2) {
                break;
            }
            System.out.println("Yuhu");
        }
        System.out.println(i);
    }

    @Test
    public void test045Loops() {
        int i;
        for (i = 0; i < 5; i++) {
            if (i >= 3) {
                break;
            }
            System.out.println("Yuhu");
            if (i >= 1) {
                continue;
            }
            System.out.println("Tata");
        }
        System.out.println(i);
    }

}
