
public interface Table {
    /**
     * Zwraca wartość znajdującą się na pozycji position.
     *
     * @param position testowane położenie
     * @return ustawiona na tej pozycji wartość
     */
    public boolean get(Tuple position);

    /**
     * Ustawia true na pozycji wskazanej za pomocą position
     *
     * @param position położenie, którego stan metoda ustawi na true
     */
    public void set(Tuple position);
}
