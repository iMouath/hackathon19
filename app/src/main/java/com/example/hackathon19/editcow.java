package com.example.hackathon19;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.util.Scanner;
public class EditCow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editcow);

public class Cowsay
{
    public static void main(String[] args) {
        printInput();
        printCow();
    }

    private static void printCow(){
        System.out.println("  |  ^__^");
        System.out.println("   - (oo)|_______");
        System.out.println("     (__)|       )/|/");
        System.out.println("         ||----w |");
        System.out.println("        ||     ||");
    }

    private static void printInput(){
        String input = getInput();

        System.out.print(" ");
        for (int i = 0; i < input.length() + 2; i++){
            System.out.print("_");
        }
        System.out.println();
        System.out.println("< " + input + " >");
        System.out.print(" ");
        for (int i = 0; i < input.length() + 2; i++){
            System.out.print("-");
        }
        System.out.println();

    }

    private static String getInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}