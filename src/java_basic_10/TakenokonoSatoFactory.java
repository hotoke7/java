package java_basic_10;

public class TakenokonoSatoFactory implements SnackFactory{
    @Override
    public Snack createSnack() {
        return new TakenokonoSato();
    }
}
