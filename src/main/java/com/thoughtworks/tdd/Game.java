package com.thoughtworks.tdd;

public class Game {
    public static String FizzBuzz(int i){
        String result = "";

        if(i % 3 == 0)
            result += "Fizz";
        if(i % 5 == 0)
            result += "Buzz";
        if(i % 7 == 0)
            result += "Whizz";
        if(i == 13)
            result += "Fizz";

        if(result.isEmpty())
            result += i;

        return result;
    }
}
