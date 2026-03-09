package Ques2;

public class Timer implements Runnable {
    @Override
    public void run(){
        int i = 1;
        while(true) {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            if (i==10)
                i=1;
            else
                i++;
        }
    }

    public static void main(String[] args) {
        Timer obj = new Timer();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
