package com.company.abstractfactorypattern;

public interface AbstractFactory<T> {

    T create(String animalType) ;
}
