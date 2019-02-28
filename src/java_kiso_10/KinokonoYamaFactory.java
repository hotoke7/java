package java_kiso_10;

public class KinokonoYamaFactory implements SnackFactory{

    @Override
    public Snack createSnack() {
        return new KinokonoYama();
    }
}
