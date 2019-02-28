package java_kiso_10;

public class TakenokonoSatoFactory implements SnackFactory{
    @Override
    public Snack createSnack() {
        return new TakenokonoSato();
    }
}
