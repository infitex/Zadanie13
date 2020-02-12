
public interface FactoryInterface {
    /**
     * Metoda przekazuje do fabryki generator, którego należy użyć w celu
     * przygotowania wyniku.
     *
     * @param gi referencja do obiektu zgodnego z {@link GeneratorInterface}
     */
    public void setGenerator(GeneratorInterface gi);

    /**
     * Metoda ustawia liczbę, wątków, które współpracując mają doprowadzić do
     * szybszego uzyskania wyniku.
     *
     * @param threads liczba wątków, które powinny być używane przez fabrykę.
     */
    public void setNumberOfThreads(int threads);

    /**
     * Metoda losowo ustawia w przekazanej tablicy positions położeń na wartość
     * true. Początkowy stan przekazanej tablicy to wszystkie pozycje ustalone na
     * false.
     *
     * @param table     tablica do zmodyfikowania
     * @param positions liczba pozycji, które w tablicy mają zostać ustalone na
     *                  true.
     */
    public void execute(boolean[] table, int positions);

}
