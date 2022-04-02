/**
 * Classes23
 */
public class Classes23 extends Thread {

    public static void main(String[] args) {
        Classes23 thread = new Classes23();
        thread.start();
        System.out.println("This code is outside of the thread.");
    }
    public void run() {
        System.out.println("This code running in a thread.");
    }

}