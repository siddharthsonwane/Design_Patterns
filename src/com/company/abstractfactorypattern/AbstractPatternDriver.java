package com.company.abstractfactorypattern;

public class AbstractPatternDriver {
    public static void main(String[] args) {

        AbstractFactory abstractFactory;
        //creating a brown toy dog
        abstractFactory = FactoryProvider.getFactory("Toy");
        Animal toy =(Animal) abstractFactory.create("Dog");

        String result = "A " + toy.getType() +" sound " + toy.makeSound();

        System.out.println(result);

    }
}
