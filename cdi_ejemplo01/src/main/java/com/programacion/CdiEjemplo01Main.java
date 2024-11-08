package com.programacion;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class CdiEjemplo01Main {
    public static void main(String[] args) {
        SeContainer container = SeContainerInitializer
                .newInstance()
                .initialize();
    }
}// FINAL CLASS
