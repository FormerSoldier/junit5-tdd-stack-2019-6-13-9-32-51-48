package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GameTest {

    @Test
    public void should_return_2_when_call_number_given_2(){
        assertThat(Game.FizzBuzz(2),is("2"));
    }

    @Test
    public void should_return_Fizz_when_call_number_given_3(){
        assertThat(Game.FizzBuzz(3),is("Fizz"));
    }

    @Test
    public void shoule_return_Buzz_when_call_number_given_5(){
        assertThat(Game.FizzBuzz(5),is("Buzz"));
    }

    @Test
    public void should_return_Whizz_when_call_number_given_7(){
        assertThat(Game.FizzBuzz(7),is("Whizz"));
    }

    @Test
    public void should_return_Fizz_when_call_number_given_13(){
        assertThat(Game.FizzBuzz(13),is("Fizz"));
    }

    @Test
    public void should_return_FizzBuzz_when_call_number_given_15(){
        assertThat(Game.FizzBuzz(15),is("FizzBuzz"));
    }

    @Test
    public void should_return_FizzWhizz_when_call_number_given_21(){
        assertThat(Game.FizzBuzz(21),is("FizzWhizz"));
    }

    @Test
    public void should_return_BuzzWhizz_when_call_number_given_35(){
        assertThat(Game.FizzBuzz(35),is("BuzzWhizz"));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_call_number_given_105(){
        assertThat(Game.FizzBuzz(105),is("FizzBuzzWhizz"));
    }

}
