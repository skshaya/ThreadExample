/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadPriority;

/**
 *
 * @author sksha
 */
class Animal implements Runnable{
    String type;
    @Override
    public void run(){
        for(int i=0; i<1000; i++){}
            System.out.println("I'm a" +" " +type);
        }
    }

class Dog extends Animal{
    Dog(){
        this.type="Dog";
    }

}

class Cat extends Animal{
   Cat(){
       this.type="Cat";
   }
    
}

class Rat extends Animal{
   Rat(){
       this.type="Rat";
   }
    
}

public class ThreadPriority {
    public static void main(String args[]){
        System.out.println(Thread.currentThread().getName());
        Animal dog =  new Dog();
        Animal cat = new Cat();
        Animal rat = new Rat();
        
        Thread dogT = new Thread(dog);
        Thread catT = new Thread(cat);
        Thread ratT = new Thread(rat);
        
        catT.setPriority(1);
        dogT.setPriority(10);
        ratT.setPriority(5);
        
        catT.start();
        dogT.start();
        ratT.start();
    }
}
