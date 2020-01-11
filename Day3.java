import org.testng.annotations.Test;

public class Day3 {
    @Test
    public void testLoopRepeat() {
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

    @Test
    public void testStringRepeat() {
        String greeting = "Hello world!";
        System.out.println(greeting);
    }

    @Test
    public void testStringRepeat2() {
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println(helloString);
    }

    @Test
    public void testStringRepeat3() {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        for (int i = 0; i < len; i++) {
            tempCharArray[i] =
                    palindrome.charAt(i);
            for (int j = 0; j < len; j++) {
                charArray[j] =
                        tempCharArray[len - 1 - j];
            }
        System.out.println(i);
            String reversePalindrome =
                    new String(charArray);
            System.out.println(reversePalindrome);
    }
}
}
