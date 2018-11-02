package com.practice.demo.training.polymorphismandinterface;

public class TakenokonoSatoFactory implements SnackFactory{
    @Override
    public Snack createSnack() {
        return new TakenokonoSato();
    }
}
