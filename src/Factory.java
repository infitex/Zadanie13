public class Factory implements FactoryInterface {

    class myThread implements Runnable {

        Thread t;

        myThread()
        {
            t = new Thread(this);
            t.start();
        }

        @Override
        public void run() {




        }
    }


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
    public void execute(Table table, int positions) {


        myThread[] arrayThreads = new myThread[threads];

        for(int i=0; i<threads ; i++){

            arrayThreads[i] = new myThread();

        }




    }
}
