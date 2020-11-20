/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadSleep;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sksha
 */
public class ThreadSleep {
    public static void main(String args[]){
       Thread t1 = new T1();
       Thread t2 = new T1();
       t1.start();
       t2.start();
       
       
    }
}

class T1 extends Thread {
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
             try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadSleep.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

}