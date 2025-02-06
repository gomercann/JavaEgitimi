package threading;

public class Main {

    public static void main(String[] args) {
        KronometreThread t1 = new KronometreThread("t1");
        KronometreThread t2 = new KronometreThread("t2");
        KronometreThread t3 = new KronometreThread("t3");

        t1.baslat();
        t2.baslat();
        t3.baslat();
    }
}
