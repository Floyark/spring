package com.statik;

public class StatiTest {
    private int s=10;

    public class B{
        private int s=12;
        public void print(){
            int s=14;
            System.out.println(s);
            System.out.println(this.s);
            System.out.println(StatiTest.this.s);
        }
    }

}
