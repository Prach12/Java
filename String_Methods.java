/*
String: Methods
*/
class String_Methods{
    public static void main(String[] args)
    {
        String str1 = "Welcome";
        String str2 = "Welcome";
        String str3 = "hello";

        System.out.println(str1.length());
        System.out.println(str1.charAt(3));
        System.out.println(str1.substring(3));
        System.out.println(str1.substring(3,6));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str1.indexOf('o'));
        System.out.println(str3.indexOf('l'));
        System.out.println(str3.indexOf('x'));
    }
}