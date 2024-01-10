package threads;

public class MyThread extends Thread {
    //learn thread
    @Override
    public void start() {
        super.start();
        System.out.println("Checked");
    }

    @Override
    public void run() {
        System.out.println("thread ok");
    }
}
