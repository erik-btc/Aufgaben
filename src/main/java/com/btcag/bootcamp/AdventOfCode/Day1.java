package com.btcag.bootcamp.AdventOfCode;

import java.io.*;
import java.util.*;

public class Day1 {
    public static void main(String[] args) {
        int number = 0;
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        List<Integer> array3 = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] numbers = line.trim().split("\\s+");
                array1.add(Integer.parseInt(numbers[0]));
                array2.add(Integer.parseInt(numbers[1]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // part 2
        for (int i = 0; i < array1.size(); i++) {
            int counter = 0;
            int temp;
            for (int j = 0; j < array2.size(); j++) {
                if (Objects.equals(array1.get(i), array2.get(j))){
                    counter++;
                }
            }
            temp = array1.get(i) * counter;
            number += temp;
        }

        System.out.println(number);

        // Part 1
//        Collections.sort(array1);
//        Collections.sort(array2);
//
//        for(int i = 0; i < array1.size(); i++){
//            if(array1.get(i) < array2.get(i)){
//                int temp = array2.get(i) - array1.get(i);
//                array3.add(temp);
//            }
//            else if(array1.get(i) > array2.get(i)){
//                int temp = array1.get(i) - array2.get(i);
//                array3.add(temp);
//            }
//            else if(Objects.equals(array1.get(i), array2.get(i))){
//                array3.add(0);
//            }
//        }
//
//        int difference = 0;
//        for(int i = 0; i < array3.size(); i++){
//            difference += array3.get(i);
//        }
//
//        System.out.println(difference);
    }
}
