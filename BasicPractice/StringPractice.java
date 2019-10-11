public class StringPractice
{
    public static void main(String [] args) {
        String str1 = "test";
        String str2 = "test";
        String str3 = new String("test");
        String str4 = new String("test");
        System.out.println( str1 == str2 );
        System.out.println( str1 == str3 );
        System.out.println( str3 == str4 );

        StringBuilder builder = new StringBuilder();
        int max = 100;
        for (int i = 0; i < max; i++) {
            builder.append(i).append("+");
        }
        
        System.out.println( builder.append(max) );

    }
}
