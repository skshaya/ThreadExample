/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexample;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sksha
 */
public class ThreadExample {
    
    public static void main(String[] args) {
        Thread t1 = new T1();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + ":" +i);
        }
    }
}
    
    
    class T1 extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + ":" +i);
        }
    }
}

