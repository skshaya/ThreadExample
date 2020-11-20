/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadYield;

/**
 *
 * @author sksha
 */
public class ThreadYield {
    public static void main(String args[]) {
        Thread t1 = new T1();
        t1.start();
        Thread.yield();
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}

class T1 extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
