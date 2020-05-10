package com.fierceq.stream.tutorial;

import com.fierceq.utils.CommonUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PatternNum {
    public static void main(String[] args) {
        String str = "1,4,5,7,6,56,787,543,df";
        List<Integer> integers = Arrays.stream(str.split(","))
                .filter(id -> CommonUtils.NUMBER_PATTERN.matcher(id).matches()).map(Integer::parseInt).collect(Collectors.toList());

        integers.forEach(e -> System.out.println(e));

    }
}
