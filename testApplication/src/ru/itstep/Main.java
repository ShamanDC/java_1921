package ru.itstep;

class A {}
class B extends A {}

public class Main {
    public static void main(String[] args) {
       MyCollection m = new MyCollection();
       m.add("123");
       m.add("789");
       m.add("124567");

       while(m.hasNext()) {
           System.out.println(m.next());
       }



//    A a1 = new A();
//    B b1 = (A)a1;


    }




}

