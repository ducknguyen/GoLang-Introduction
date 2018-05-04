/**
 * Code by Anton Dovzhenko
 * https://stackoverflow.com/questions/41094056/how-to-write-pi-calculation-program-in-java-using-multi-thread
 */
public class ConcurrentPi
{
    public static void main(String ... args) throws InterruptedException {

        int threadCount = 100000;
        int N = 100000;
        PiThread[] threads = new PiThread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            threads[i] = new PiThread(threadCount, i, N);
            threads[i].start();
        }
        for (int i = 0; i < threadCount; i++) {
            threads[i].join();
        }
        double pi = 0;
        for (int i = 0; i < threadCount; i++) {
            pi += threads[i].getSum();
        }
        System.out.print("PI = " + pi*4);

    }

    static class PiThread extends Thread {

        private final int threadCount;
        private final int threadRemainder;
        private final int N;
        private double sum  = 0;

        public PiThread(int threadCount, int threadRemainder, int n) {
            this.threadCount = threadCount;
            this.threadRemainder = threadRemainder;
            N = n;
        }

        @Override
        public void run() {
            for (int i = 0; i <= N; i++) {
                if (i % threadCount == threadRemainder) {
                    sum += Math.pow(-1, i) / (2 * i + 1);
                }
            }
        }

        public double getSum() {
            return sum;
        }
    }
}
