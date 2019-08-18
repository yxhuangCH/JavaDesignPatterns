package com.yxhuang.pattern.builder;

public class Main {

    NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
            .calories(100)
            .sodium(9)
            .carbohydrate(290)
            .build();

}
