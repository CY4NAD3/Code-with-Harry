package com.company;
import java.lang.*;

public class cwh_15_ps2 {
    public static void main(String[] args){
        //problem 1
        String name = "Jack Parker";
        name= name.toLowerCase();
        System.out.println(name);

        //problem 2
        String text = "To My      Friend";
        text = text.replace(" ","_");
        System.out.println(text);

        //problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Azraful Alam");
        System.out.println(letter);

        //problem 4
        String myString = "This string  contains   double and triple spaces";
        System.out.println("Double space no:" + myString.indexOf("  "));
        System.out.println("Triple space no:" + myString.indexOf("   "));

        //problem 5
        String myLetter = "Dear Harry, \n\tThis Java Course is nice.\n\tThanks!";
        System.out.println(myLetter);
    }
}
