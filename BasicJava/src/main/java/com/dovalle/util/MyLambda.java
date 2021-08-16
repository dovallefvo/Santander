package com.dovalle.util;

import com.dovalle.interfaces.SimpleLambda;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyLambda {
    public static void callSimpleLambda() {
        //in this case the lambda receives a value, then print the value at the console and return the same value.
        // for more ONE line of instructions, it's necessary to put {}; (the instructions should be into the braces
        SimpleLambda mySimpleLambda = value -> {
            System.out.println(String.format("\nFunctional interface using lambda: %s", value));
            return value;
        };

        mySimpleLambda.printConsole("MY_VALUE_ARGUMENT_FOR_LAMBDA");
    }

    public static void callConsumerLambda(){
        Consumer<String> showAtConsole = System.out::println;
        showAtConsole.accept("\nSample to consumer a function using FunctionalInterface (Lambda).");
    }

    public static void callFunctionLambda(){
        //<String, String> the first type is the parameter; and the second type 'String' is the return
        Function<String, String> reversedString = text -> new StringBuilder(text).reverse().toString();
        System.out.println(String.format("\nFunction Lambda using a String to reversed it. %s", reversedString.apply("Felipe")));
    }

    public static void callPredicateLambda() {
        Random myRandom = new Random();
        int number = myRandom.nextInt();
        Predicate<Integer> verifyNumber = value -> (value % 2) == 0;
        String evenOrOdd = verifyNumber.test(number) ? "EVEN" : "ODD";
        System.out.println(String.format("\nPredicate Lambda is used to test a condition. In this case verify if a random number is even or odd. Result: %s is %s", number, evenOrOdd));

    }

    public static void callSupplierLambda(){
        Supplier<LocalDate> nowDate = () -> LocalDate.now();
        System.out.println(String.format("\nSupplier Lambda by default doesn't receive parameters, just calls a function or intances an object as return. In my example, I call the now date: %s", nowDate.get()));
    }

}
