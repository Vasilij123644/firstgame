package com.example.firstgame;

public class Scores {
    public static String score = "0";
    public static void setscore(int x)
    {
        score = Integer.toString(x);
    }
    public static String getscore()
    {
            return score;
    }
}
