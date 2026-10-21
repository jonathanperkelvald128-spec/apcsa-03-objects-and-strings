public class QuickMath {
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        String s = "Score";
        char c = 'A';

        System.out.println(s + a);
        System.out.println(s + a + b);
        System.out.println(s + (a + b));
        System.out.println(a + b + s );
        System.out.println(a + (b + s));
        System.out.println("" + a + b);
        System.out.println(c + 1);
        System.out.println("" + c + 1);
        System.out.println((char)(c + 1));
        System.out.println(s + c);

        String word = "hello";
        word.toUpperCase();
        System.out.println(word);

        word = word.toUpperCase();
        System.out.println(word);
    }   

}