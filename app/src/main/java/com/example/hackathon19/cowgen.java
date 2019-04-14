package com.example.hackathon19;

import java.util.LinkedList;

public class cowgen {

    public static String generate(){
        return cowsay();
    }
    private static String cowsay(){

        String cowdraw = "" +
                "        \\   ^__^\n" +
                "         \\  (oo)\\_______\n" +
                "            (__)\\       )\\/\\\n" +
                "                ||----w |\n" +
                "                ||     ||\n" +
                "";
        return cowdraw;
    }

    public static String grabSay (String str){
        return bubbleText (str);
    }
    private static String bubbleText (String str){
        LinkedList<String> bubble = new LinkedList<>();
        String star = "";
        return star;

    }

}
