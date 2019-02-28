package java_basic_10;

public class KinokonoYamaFactory implements SnackFactory{

    @Override
    public Snack createSnack() {
        return new KinokonoYama();
    }
}
