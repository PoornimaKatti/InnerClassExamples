package com.AnonymousinnerClass;

abstract class AnonymousClass {
        abstract void eat();
    }
    class TestAnonymousInner{
        public static void main(String args[]){
            AnonymousClass a=new AnonymousClass(){
                void eat(){
                    System.out.println("nice fruits");
                }
            };
            a.eat();
        }
    }

