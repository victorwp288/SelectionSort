package com.company;

import java.util.Arrays;

import static com.company.Select.select;

public class Main {

    public static void main(String[] args) {
        int[] array = {30,-110,-354,145,239,69};
        System.out.println(Arrays.toString(array));
        array = select(array);
        System.out.println("");
        System.out.println(Arrays.toString(array));
    }


}
