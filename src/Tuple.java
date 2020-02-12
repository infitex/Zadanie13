/**
 * Klasa reprezentuje położenie w dwuwymiarowej przestrzeni. Dokładna
 * implementacja tej klasy pojawi się na etapie testu.
 */
public class Tuple {

    private int position;
    private boolean value;

    public Tuple(int position, boolean value) {
        this.position = position;
        this.value = value;
    }

    public int getPosition() {
        return position;
    }

    public boolean isValue() {
        return value;
    }


}
