package main;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {




    public static void main(String[] args) {
       /* Pattern  pattern=Pattern.compile("..m..");
        Matcher matcher=pattern.matcher("abmcd");
//        System.out.println(matcher.matches());

        Pattern  pattern2=Pattern.compile("^4\\d*");
        Matcher matcher2=pattern2.matcher("");*/
/*
        Pattern pattern3=Pattern.compile("ab");
        Matcher matcher3= pattern3.matcher("ababbabab");
        int count=0;
        while (matcher3.find()){
            count++;
            System.out.println("start: "+matcher3.start()+"  end: "+matcher3.end()+"  group: "+matcher3.group());
        }
        System.out.println("count="+count);*/

        /*Pattern pattern=Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher=pattern.matcher("a7b@z#9");
        while(matcher.find()){
            System.out.println(matcher.start()+"   "+ matcher.group());
        }*/
/*
        Pattern pattern=Pattern.compile("\\S");
        Matcher  matcher=pattern.matcher("a7b k@9");
        while (matcher.find()){
            System.out.println(matcher.start()+"   "+ matcher.group());
        }*/
/*
        Pattern pattern=Pattern.compile(".");
        Matcher matcher=pattern.matcher(" a7b@z#9");
        while (matcher.find()){
            System.out.println(matcher.start()+"    "+matcher.group());
        }*/

      /*  Pattern pattern=Pattern.compile(".");
        Matcher matcher=pattern.matcher("abaabaaab");
        while (matcher.find()){
            System.out.println(matcher.start()+"....."+matcher.group());
        }*/

       Pattern pattern=Pattern.compile("\\.");
//       Matcher matcher=pattern.matcher("Dorga software solutions");

      String[] tab= pattern.split("www.software.com");
        for (String s: tab) {
            System.out.println(s);
        }

    }
}
