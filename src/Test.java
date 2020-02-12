public class Test {

    public static void main(String[] args) {

        Factory f1 = new Factory();

        f1.setNumberOfThreads(10);
        f1.execute(f1.tablica,5);


        for(int i=0 ; i<100; i++)
        {
            System.out.println("Tablica["+i+"]="+f1.tablica[i]);
        }


    }

}
