package com.example.hackathon19;

import java.util.LinkedList;

public class cowgen {

    public String generate(String str){
        return cowsay(str);
    }
    private String cowsay(String str){

        String cowdraw = "" +
                "        \\   ^__^\n" +
                "         \\  (oo)\\_______\n" +
                "            (__)\\       )\\/\\\n" +
                "                ||----w |\n" +
                "                ||     ||\n" +
                "";
        return cowdraw;
    }

    public String grabSay (String str){
        return bubbleText (str);
    }
    private String bubbleText (String str){
        LinkedList<String> bubble = new LinkedList<>();
        String star = "";
        return star;

    }

}
