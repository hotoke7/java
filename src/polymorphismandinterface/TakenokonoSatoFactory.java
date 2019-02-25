package polymorphismandinterface;

public class TakenokonoSatoFactory implements SnackFactory{
    @Override
    public Snack createSnack() {
        return new TakenokonoSato();
    }
}
