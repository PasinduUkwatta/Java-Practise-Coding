import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpresions {
    public static void main(String[] args) {

        //FROM THIS WE ARE CHECKING ABOUT THE CAPITAL LETTERS IN THE SENTENCES
        String pattern = "[a-z]+";
        String check ="Happy Learing ! Welcome to Java Programming";

        Pattern p = Pattern.compile(pattern);
        Matcher c =p.matcher(check);

        while (c.find()){
            System.out.println(check.substring(c.start(),c.end()));
        }

    }
}
