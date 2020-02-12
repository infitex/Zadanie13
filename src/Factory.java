public class Factory implements FactoryInterface {

    public class myThread implements Runnable {

        Thread t;
        int calc;
        int name;

        myThread(int calc, int name)
        {
            this.name=name;
            t = new Thread(this);
            t.start();
            this.calc=calc;
        }

        @Override
        public void run() {

            System.out.println("Watek nr"+ name);
            tablica[calc]= true;

        }
    }

    boolean [] tablica = new boolean[100];


    private int threads;
    private  GeneratorInterface generator;


    @Override
    public void setGenerator(GeneratorInterface gi) {
        this.generator = gi;
    }

    @Override
    public void setNumberOfThreads(int threads) {
        this.threads = threads;
    }

    @Override
    public void execute(boolean[] table, int positions) {


        myThread[] arrayThreads = new myThread[threads];


        for(int i=0; i<100; i++)
        {
            tablica[i]=false;
        }

        int table_length=table.length;
        int calc=table_length/threads;

        for(int i=0; i<threads ; i++){

            arrayThreads[i] = new myThread(calc-10,i);
            calc = 10 +calc;

        }

        for(int i=0; i<threads;i++) {

            arrayThreads[i].run();
        }

    }
}
