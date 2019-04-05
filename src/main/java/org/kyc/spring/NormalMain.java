package org.kyc.spring;


/**
 * Greeter 인스턴스를 직접 생성하는 Main
 *
 * @author Jacob
 */
public class NormalMain {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet());
       
        Greeter greeter1 = new Greeter();
        System.out.println(greeter1.greet());
       
        Greeter greeter2 = new Greeter();
        System.out.println(greeter2.greet());
       
    }
}