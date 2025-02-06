package threading;

public class KronometreThread implements Runnable {

    private Thread t;
    private String threadAdi;

    public KronometreThread(String threadAdi) {
        this.threadAdi = threadAdi;
        System.out.println("Thread Oluşturuluyor: " + threadAdi);
    }

    @Override
    public void run() {
        System.out.println("Thread Çalıştırılıyor: " + threadAdi);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadAdi + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Kesildi");
        }
        System.out.println("Thread Bitti: " + threadAdi);
    }

    public void baslat() {
        if (t == null) {
            t = new Thread(this, threadAdi);
            t.start();
        }
    }
}
