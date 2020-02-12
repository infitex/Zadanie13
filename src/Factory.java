public class Factory implements FactoryInterface {


    int tablica[][] = new int[10][10];
    int ile_watkow;


    @Override
    public void setGenerator(GeneratorInterface gi) {

    }

    @Override
    public void setNumberOfThreads(int threads) {

        ile_watkow=threads;

    }

    @Override
    public void execute(Table table, int positions) {

    }
}
