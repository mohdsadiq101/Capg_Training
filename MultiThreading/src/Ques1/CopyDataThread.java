package Ques1;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyDataThread implements Runnable{
    @Override
    public void run() {
        try {
            FileReader reader = new FileReader("data/source.txt");
            FileWriter writer = new FileWriter("data/target.txt",true);
            char data;
            int c = 0;
            while((data = (char) reader.read()) != -1){
                writer.write((char)data);
                c++;
                if (c == 10){
                    c=0;
                    System.out.println("10 characters are copied");
                    Thread.sleep(5000);
                }

            }
            reader.close();
            writer.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyDataThread obj = new CopyDataThread();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
