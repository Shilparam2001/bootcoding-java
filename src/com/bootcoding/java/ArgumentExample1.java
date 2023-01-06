package com.bootcoding.java;

public class ArgumentExample1 {
    public static void main (String [] args) {
        int len = args.length;
        System.out.println("Number of Arguments provided is " + len);

        int sum = 0;
        for (int i = 0; i < len; i++){
            System.out.println(args[i]);
            int number = Integer.parseInt(args[i]);
              sum = sum + number;
        }
        System.out.println(sum);

    }
}
//chess argument
//Cricket
//College