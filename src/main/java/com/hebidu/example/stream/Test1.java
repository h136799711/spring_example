package com.hebidu.example.stream;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {

        List<String> list = Lists.newArrayList("bcd", "ab", "dee333", "eee");

        List<String> result = list.stream()
                .filter(e -> e.length() > 3)
                .map(e -> e.charAt(0))
                .map(e -> String.valueOf(e))
                .collect(Collectors.toList());
        System.out.println("------");
        System.out.println(result);
    }

}
