
public interface GeneratorInterface {
    /**
     * Metoda zwraca losowo wygenerowany obiekt typu Tuple. Położenia mogą się
     * powtarzać. Różne obiekty mogą reprezentować to samo położenie.
     *
     * @return losowe położenie
     */
    public Tuple get();
}
