package org.example.regex.yigit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String string_pattern = "[abc]def";// ilk herif abc ola biler sonrasinda da def gelmelidir
//        System.out.println("adef".matches(pattern));
//        System.out.println("bdef".matches(pattern));
//        System.out.println("abdef".matches(pattern));
//        System.out.println("ade".matches(pattern));
//        System.out.println("ddef".matches(pattern));
//        System.out.println("df".matches(pattern));

        /*Pattern pattern = Pattern.compile("[^abc]def"); // ilk herf abc olmsin
        Matcher matcher =pattern.matcher("adef");
        Matcher matcher1 =pattern.matcher("ef");
        Matcher matcher2 =pattern.matcher("def");
        Matcher matcher3 =pattern.matcher("fdef");
        Matcher matcher4 =pattern.matcher(" def");
        Matcher matcher5 =pattern.matcher("1def");
        Matcher matcher6 =pattern.matcher("!def");
        Matcher matcher7 =pattern.matcher("" +
                "" +
                "def");

        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        System.out.println(matcher3.matches());
        System.out.println(matcher4.matches());
        System.out.println(matcher5.matches());
        System.out.println(matcher6.matches());
        System.out.println(matcher7.matches());

        System.out.println(Pattern.matches("[0-9]","2"));
        System.out.println(Pattern.matches("[0-9]","a"));
        System.out.println(Pattern.matches("[0-9]d[0-5]","1d4"));
        System.out.println(Pattern.matches("[0-9]d[0-5]","3d9"));*/

        String regex ="evet|hayir|cikis";

        System.out.println("evet".matches(regex));
        System.out.println("hayir".matches(regex));
        System.out.println("cikis".matches(regex));
        System.out.println("cikisi".matches(regex));

    }

}
