package com.practice.demo.training.polymorphismandinterface;

public class KinokonoYamaFactory implements SnackFactory{

    @Override
    public Snack createSnack() {
        return new KinokonoYama();
    }
}
