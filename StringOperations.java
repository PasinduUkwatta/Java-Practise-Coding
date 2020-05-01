public class StringOperations {
    public static void main(String[] args) {
        String str1 = "pasindu";
        String str2 = "pbsindu";

        //this method will give the length of the string
        System.out.println(str1.length());

        //this method will give the char at the given index of the string
        System.out.println(str1.charAt(4));

        //this method will compare the given string with the available string
        System.out.println(str1.compareTo(str2));


        //this method will check the empty of the string
        String str3 = "";
        System.out.println(str3.isEmpty());

        //this method will give the uppercase of the string
        String str4 = "afdSFS";
        System.out.println(str4.toUpperCase());

        int a =10;
        String s =String.valueOf(a);
        System.out.println(s);


        //this method will replace the char with given char of the string
        String str5 ="aabbcc";
        str5 =str5.replace('a','d');
        System.out.println(str5);

        //this method will check the availabiltiy of the char in the string
        System.out.println(str5.contains("a"));

        String str7 = "Hello";
        String str8 = "hello";

        System.out.println(str7.equals(str8));

        String str9 = "Java";
        System.out.println(str9.endsWith("u"));


    }
}
